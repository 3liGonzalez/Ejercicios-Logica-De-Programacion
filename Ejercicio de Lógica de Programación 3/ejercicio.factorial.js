function calcularFactorial() {
    let numero = prompt("Por favor ingresa un número para calcular su factorial:");

    // Validar si la entrada es un número
    if (isNaN(numero)) {
        console.error("Error: Debes ingresar un número válido.");
        calcularFactorial(); // Volver a solicitar el dato
        return;
    }

    // Convertir el número ingresado a un entero
    numero = parseInt(numero);

    // Calcular el factorial utilizando recursión
    function factorial(n) {
        if (n === 0 || n === 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Imprimir el resultado del factorial
    console.log(`El factorial de ${numero} es: ${factorial(numero)}`);
}

// Llamar a la función para comenzar el programa
calcularFactorial();
