function convertirTemperatura() {
    let temperaturaCelsius;

    // Pedir al usuario la temperatura en grados Celsius hasta que se ingrese un valor numérico
    do {
        temperaturaCelsius = prompt("Ingresa la temperatura en grados Celsius:");
    } while (isNaN(temperaturaCelsius));

    // Convertir la temperatura a número
    temperaturaCelsius = parseFloat(temperaturaCelsius);

    // Calcular temperatura en grados Fahrenheit y Kelvin
    let temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
    let temperaturaKelvin = temperaturaCelsius + 273.15;

    // Imprimir resultados
    console.log("Grados Kelvin:", temperaturaKelvin);
    console.log("Grados Fahrenheit:", temperaturaFahrenheit);
}

// Llamar a la función para ejecutar el programa
convertirTemperatura();
