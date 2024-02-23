function obtenerNumero() {
    let numero = prompt("Por favor ingresa un número para generar la serie de Fibonacci:");

    // Verificar si el valor proporcionado es un número válido
    while (isNaN(numero)) {
        numero = prompt("Por favor ingresa un número válido:");
    }

    return parseInt(numero);
}

function fibonacci(n) {
    let serie = [0, 1];
    for (let i = 2; i < n; i++) {
        serie.push(serie[i - 1] + serie[i - 2]);
    }
    return serie;
}

function imprimirSerie(serie) {
    console.log("La serie de Fibonacci es:");
    for (let i = 0; i < serie.length; i++) {
        console.log(serie[i]);
    }
}

// Obtener el número del usuario
let numero = obtenerNumero();

// Generar la serie de Fibonacci
let serieFibonacci = fibonacci(numero);

// Imprimir la serie de Fibonacci
imprimirSerie(serieFibonacci);
