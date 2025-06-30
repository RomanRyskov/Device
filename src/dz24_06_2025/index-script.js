let student = {
    name: "Рома",
    age: 33,
    group: "22и"
};
for(key in student){
    console.log(key +": " + student[key])
}



let car = {
    brand: "Toyota",
    model: "Corolla",
    year: 2020
};
car["year"] = 2022;
console.log(car);



function countProperties(obj){
    return Object.keys(obj);
}
function countProperties2(obj){
    let count = 0;
    for(let key in obj){
        count += 1;
    }
    return count;
}
console.log(countProperties(car));
console.log(countProperties2(car));


function plus1(n){
    for (let key = 1; key <= n; key++) {
        console.log(key);
    }
}
plus1(7);



let numbers = [10, 20, 30, 40, 50];
function sumArr(arr){
    let count = 0;
    for (let key in arr){
        count += arr[key];
    }
    return count;
}
console.log(sumArr(numbers));



let fruits = ["яблоко", "банан", "апельсин", "груша"];
function orangeIndex(arr){
    for (let key in arr){
        if (arr[key] === "апельсин"){
            return key;
        }
    }
}
console.log(orangeIndex(fruits));



let book = {
    title: "JavaScript для начинающих",
    author: "Иван Петров",
    pages: 200,
    price: 1500
};
for(let key in book){
    console.log(key +": " + book[key])
}



let students = [
    { name: "Алексей", age: 20, group: "ПИ-101" },
    { name: "Мария", age: 19, group: "ПИ-102" },
    { name: "Иван", age: 21, group: "ПИ-101" }
];
for (let key in students){
    let n = students[key];
    for (let key in n){
        if (n.group === 'ПИ-101'){
            console.log(n.name);
        }
    }
}



let products = {
    "ноутбук": 50000,
    "телефон": 30000,
    "наушники": 8000,
    "мышь": 2000
};
let maxPrice = 0;
for (let key in products){
    if (products[key] > maxPrice) {
        maxPrice = products[key];
    }
}
console.log(maxPrice);