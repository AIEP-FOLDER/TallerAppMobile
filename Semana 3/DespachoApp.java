
// import: palabra clave para incluir librerías externas; java.util.Scanner: clase que permite leer entradas desde consola
import java.util.Scanner;

// public: accesible desde cualquier parte; class: define una clase; DespachoApp: nombre de la clase principal
public class DespachoApp {
    public static void main(String[] args) { // main: método principal que se ejecuta al iniciar el programa; static: no requiere instancia; void: no retorna valor; String[] args: argumentos desde línea de comandos
        Scanner sc = new Scanner(System.in); // Scanner: clase para leer datos; sc: nombre del objeto; new Scanner(System.in): instancia que lee desde consola

        // Datos del vehículo


        // Solicita la marca del vehículo al usuario
        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine(); // String: tipo de dato texto; marca: variable que almacena la marca; sc.nextLine(): lee línea completa desde consola

        // Solicita el modelo del vehículo al usuario
        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine(); // String: tipo de dato texto; modelo: variable que almacena el modelo; sc.nextLine(): lee línea completa desde consola

        // Solicita el tipo de combustible del vehículo al usuario
        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine(); // String: tipo de dato texto; combustible: variable que almacena el combustible; sc.nextLine(): lee línea completa desde consola


        // Solicita la capacidad de pasajeros del vehículo al usuario
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = 0; // int: tipo entero; capacidad: variable inicializada en 0
        // aqui se transforma el numero ingresado en un int
        try { // try: intenta ejecutar el bloque de código
            capacidad = Integer.parseInt(sc.nextLine()); // Integer.parseInt: convierte texto a entero; sc.nextLine(): lee entrada del usuario

        } catch (NumberFormatException e) { // catch: captura errores; NumberFormatException: error si el texto no es convertible a número

            System.out.println("Error: La capacidad debe ser un número entero."); // Mensaje de error si la conversión falla

            return; // return: termina la ejecución del programa
        }

        // Datos de la compra
        System.out.print("Ingrese el total de la compra en pesos: "); // Solicita el monto total de la compra

        int totalCompra = 0;
        try {
            totalCompra = Integer.parseInt(sc.nextLine()); // Integer.parseInt: convierte texto a entero; sc.nextLine(): lee entrada del usuario
        } catch (NumberFormatException e) { // catch: captura errores; NumberFormatException: error si el texto no es convertible a número
            System.out.println("Error: El total de la compra debe ser un número entero."); // Mensaje de error si la conversión falla

            return; // return: termina la ejecución del programa
        }

        System.out.print("Ingrese la distancia de despacho en kilómetros: ");
        int distanciaDespacho = 0;
        try {
            distanciaDespacho = Integer.parseInt(sc.nextLine()); // Integer.parseInt: convierte texto a entero; sc.nextLine(): lee entrada del usuario
        } catch (NumberFormatException e) { // catch: captura errores; NumberFormatException: error si el texto no es convertible a número
            System.out.println("Error: La distancia debe ser un número entero."); // Mensaje de error si la conversión falla

            return;  // return: termina la ejecución del programa
        }

        // Cálculo del costo de despacho
        int costoDespacho = 0; // Variable que almacenará el resultado del cálculo


        if (totalCompra >= 50000 && distanciaDespacho <= 20) { // Condición: si la compra es mayor o igual a 50.000 y distancia menor o igual a 20
            costoDespacho = 0; // Despacho gratuito

        } else if (totalCompra >= 25000 && totalCompra < 50000) { // Condición intermedia: compra entre 25.000 y 50.000

            costoDespacho = distanciaDespacho * 150; // Costo proporcional a la distancia

        } else { // Si no se cumple ninguna de las anteriores

            costoDespacho = distanciaDespacho * 300; // Costo más alto por distancia

        }




        // Salida
        System.out.println("------------------------------------------");
        System.out.println("\nResultados:");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
        System.out.println("El total de la compra es: $" + totalCompra);
        System.out.println("La distancia de despacho es: " + distanciaDespacho + " km");
        System.out.println("El costo de despacho es: $" + costoDespacho);
        System.out.println("------------------------------------------");
        sc.close();


    }
}