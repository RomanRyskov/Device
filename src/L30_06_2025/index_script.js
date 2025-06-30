document.addEventListener('DOMContentLoaded', () => {
 const button = document.createElement('button');
 const url = 'https://jsonplaceholder.typicode.com/posts/1';
 const url2 = 'https://jsonplaceholder.typicode.com/posts';
 button.textContent = 'Запрос';
     document.body.appendChild(button);
     button.addEventListener('click', () => {
        const xhr = new XMLHttpRequest();
        xhr.open('GET',
        url, true)
        xhr.onreadystatechange = function () {
            if(xhr.readyState === 4 && xhr.status === 200){
               const posts =  JSON.parse(xhr.responseText);
               console.log(posts);
               const newP = document.createElement('p');
               newP.textContent = posts.title;
               document.body.appendChild(newP);
            }
        };
        xhr.send();
      })
   const button2 = document.createElement('button');
   button2.textContent = 'Запрос2';
     document.body.appendChild(button2);

     button2.addEventListener('click', () => {

         fetch(url)
         .then(response => {
            if(!response.ok) {throw newError('Ошибка сети')};
            return response.json();
         })
         .then(data => console.log(data))
         .catch(error => console.error(error));
     });
     const button3 = document.createElement('button');
     button3.textContent = 'запрос3';
       document.body.appendChild(button3);
  
       button3.addEventListener('click', () => {
         getPost();
       })



       async function getPost(){
         try{
           const response = await fetch(url);
           if(!response.ok) throw newError('Ошибка сети');
           const data = await response.json();
           console.log(data);
         }
         catch(error) {
            console.error(error);
         }
       }



       async function postPost(){
         try{
           const response = await fetch(url2, {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({
               title:'Новый пост',
               body: 'Содержимое', 
               userId: 1 })
                  });
           if(!response.ok) throw newError('Ошибка сети');
           const data = await response.json();
           console.log(data);
         }
         catch(error) {
            console.error(error);
         }
       }

       const button4 = document.createElement('button');
       button4.textContent = 'запрос4';
         document.body.appendChild(button4);
    
         button4.addEventListener('click', () => {
            postPost();
         });

});