document.addEventListener('DOMContentLoaded', () => {
    const galleryContainer = document.getElementById('gallery');
    const output = document.getElementById('output');
    const loadButton = document.getElementById('loadPhotosBtn');
    const clearButton = document.createElement('button');
    clearButton.textContent = 'Очистить галерею';
    clearButton.id = 'clearGalleryBtn';
    loadButton.parentNode.insertBefore(clearButton, loadButton.nextSibling);

    function showError(message) {
        output.innerText = message;
    }

    async function fetchPhotos() {
        try {
            const response = await fetch('https://jsonplaceholder.typicode.com/photos?_limit=10');
            if (!response.ok) throw new Error(`Ошибка сети ${response.status}`);

            const photos = await response.json();
            return photos;
        } catch(error) {
            console.error("Ошибка:", error.message);
            showError("Ошибка загрузки фотографий");
            return [];
        }
    }

    function renderPhotoCard(photo) {
        const card = document.createElement('div');
        card.className = 'photo-card';

        const image = document.createElement('img');
        image.src = photo.thumbnailUrl;
        image.dataset.fullSize = photo.url;
        image.alt = photo.title;

        const title = document.createElement('p');
        title.textContent = photo.title;

        card.append(image, title);
        return card;
    }

    function toggleImageSize(event) {
        if (event.target.tagName === 'IMG') {
            const currentSrc = event.target.src;
            const fullSizeSrc = event.target.dataset.fullSize;
            event.target.src = currentSrc === fullSizeSrc ? event.target.dataset.thumbnail : fullSizeSrc;
        }
    }

    function clearGallery() {
        galleryContainer.innerHTML = '';
        output.innerText = '';
    }

    loadButton.addEventListener('click', async () => {
        clearGallery();
        const photos = await fetchPhotos();
        photos.forEach((photo) => {
            const card = renderPhotoCard(photo);
            galleryContainer.append(card);
        });
    });

    clearButton.addEventListener('click', clearGallery);

    galleryContainer.addEventListener('click', toggleImageSize);
});