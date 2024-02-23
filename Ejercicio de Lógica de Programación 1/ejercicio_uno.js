var n1 = parseInt(prompt("Ingrese el primer número:"));
var n2 = parseInt(prompt("Ingrese el segundo número:"));
var n3 = parseInt(prompt("Ingrese el tercer número:"));

var n1 = (4);
var n2 = (4);
var n3 = (2);

// Identificar el número mayor, el del centro y el menor
var maxNum = Math.max(n1, n2, n3);
var minNum = Math.min(n1, n2, n3);
var middleNum = (n1 + n2 + n3) - maxNum - minNum;

// Imprimir los números ordenados de mayor a menor
console.log( maxNum + middleNum + minNum);

// Imprimir los números ordenados de menor a mayor
console.log( minNum + middleNum + maxNum);

// Verificar si los números son iguales e imprimir un mensaje correspondiente
if (n1 === n2 && n2 === n3) {
    console.log("Los números son iguales");
} else {
    console.log("Los números son diferentes");
}
