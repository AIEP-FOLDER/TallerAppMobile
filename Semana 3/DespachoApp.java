
import java.util.Scanner;

public class DespachoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Datos del vehículo


        // Solicita la marca del vehículo al usuario
        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();

        // Solicita el modelo del vehículo al usuario
        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine();

        // Solicita el tipo de combustible del vehículo al usuario
        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine();

        // Solicita la capacidad de pasajeros del vehículo al usuario
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = 0;
        // aqui se transforma el numero ingresado en un int
        try {
            capacidad = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: La capacidad debe ser un número entero.");
            return;
        }

        // Datos de la compra
        System.out.print("Ingrese el total de la compra en pesos: ");
        int totalCompra = 0;
        try {
            totalCompra = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: El total de la compra debe ser un número entero.");
            return;
        }

        System.out.print("Ingrese la distancia de despacho en kilómetros: ");
        int distanciaDespacho = 0;
        try {
            distanciaDespacho = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: La distancia debe ser un número entero.");
            return;
        }

        // Cálculo del costo de despacho
        int costoDespacho = 0;

        if (totalCompra >= 50000 && distanciaDespacho <= 20) {
            costoDespacho = 0;
        } else if (totalCompra >= 25000 && totalCompra < 50000) {
            costoDespacho = distanciaDespacho * 150;
        } else {
            costoDespacho = distanciaDespacho * 300;
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