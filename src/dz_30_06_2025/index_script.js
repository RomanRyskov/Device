// script.js
document.addEventListener('DOMContentLoaded', function() {
    const contactButton = document.querySelector('button'); // Получаем первую кнопку на странице
    contactButton.addEventListener('click', function() {
        alert("Отправить письмо на anna.ivanova@example.com?");
    });

    const increaseAgeButton = document.createElement('button');
    increaseAgeButton.textContent = 'Увеличить возраст';
    document.body.appendChild(increaseAgeButton);

    const ageElement = document.querySelector("li");
    increaseAgeButton.addEventListener('click', () =>{
        ageElement.textContent = "Возраст: 26 лет";
    });

    const hobbyInput = document.createElement('input');
    hobbyInput.setAttribute('id', 'hobbyInput');

    const addHobbyButton = document.createElement('button');
    addHobbyButton.textContent = 'Добавить хобби';

    const hobbyList = document.querySelector('ul');

    hobbyList.insertAdjacentElement('afterend', hobbyInput);
    hobbyList.insertAdjacentElement('afterend', addHobbyButton);

    addHobbyButton.addEventListener('click', () => {
        const newHobby = hobbyInput.value.trim();
        if (newHobby === '') {
            alert("Введите хобби!");
            return;
        }
        const newHobbyItem = document.createElement('li');
        newHobbyItem.textContent = newHobby;

        hobbyList.appendChild(newHobbyItem);
        });

    const nameHeader = document.querySelector('h1');

    nameHeader.addEventListener('mouseover', () => {
        nameHeader.style.color = 'blue';
    });
    nameHeader.addEventListener('mouseout', ()=> {
        nameHeader.style.color = '';
    });

    const hobbyItems = hobbyList.querySelectorAll('li');
    hobbyItems.forEach((item) => {
        item.addEventListener('click', ()=>{
            item.classList.toggle('highlight');
        });
    });
});