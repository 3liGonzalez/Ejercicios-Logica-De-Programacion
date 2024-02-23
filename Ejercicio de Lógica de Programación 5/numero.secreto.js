// Función para generar un número aleatorio entre 1 y 100
function generarNumeroSecreto() {
    return Math.floor(Math.random() * 100) + 1;
  }
  
  // Función principal del juego
  function adivinaNumeroSecreto() {
    const numeroSecreto = generarNumeroSecreto();
    const intentos = [];
  
    while (true) {
      let intento = prompt("Intenta adivinar el número secreto (entre 1 y 100):");
      
      // Verificar si el dato ingresado es un número
      if (!isNaN(intento)) {
        intento = parseInt(intento);
  
        // Verificar si el número está dentro del rango válido
        if (intento >= 1 && intento <= 100) {
          intentos.push(intento);
  
          if (intento < numeroSecreto) {
            console.log("El número secreto es mayor. Vuelve a intentarlo.");
          } else if (intento > numeroSecreto) {
            console.log("El número secreto es menor. Vuelve a intentarlo.");
          } else {
            console.log("Felicidades, adivinaste el número secreto.");
            console.log("Lista de números introducidos:", intentos);
            break;
          }
        } else {
          console.log("El número ingresado está fuera del rango válido (1-100). Vuelve a intentarlo.");
        }
      } else {
        console.log("Error: Ingresa un número válido.");
      }
    }
  }
  
  // Llamar a la función principal para iniciar el juego
  adivinaNumeroSecreto();
  