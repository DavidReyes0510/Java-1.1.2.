//David Reyes Castillo
//1m7
//2024-1664U

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3]; // Creamos un array de tamaño 3 para almacenar los números ingresados

        // Pedimos al usuario que ingrese 3 números enteros y los almacenamos en el array
        for (int i = 0; i < 3; i++) {
            numeros[i] = obtenerEntero(scanner, i + 1);
        }

        // Calculamos la suma de los dos números más pequeños
        int suma = sumaDosMenores(numeros);
        // Calculamos la diferencia entre los dos números más grandes
        int diferencia = diferenciaDosMayores(numeros);
        // Encontramos el número mayor
        int mayor = mayorNumero(numeros);

        // Mostramos los resultados
        System.out.println("La suma de los dos números más pequeños es: " + suma);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferencia);
        System.out.println("El número mayor es: " + mayor);
    }

    // Método para obtener un número entero del usuario
    public static int obtenerEntero(Scanner scanner, int indice) {
        while (true) {
            try {
                System.out.print("Ingrese el número entero #" + indice + ": ");
                return scanner.nextInt();
            } catch (Exception e) {
                // Si se produce una excepción al intentar obtener un entero, mostramos un mensaje de error.
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.nextLine();
            }
        }
    }

    // Método para calcular la suma de los dos números más pequeños en el array
    public static int sumaDosMenores(int[] numeros) {
        Arrays.sort(numeros); // Ordenamos los números de menor a mayor
        return numeros[0] + numeros[1]; // Devolvemos la suma de los dos primeros números (los más pequeños)
    }

    // Método para calcular la diferencia entre los dos números más grandes en el array
    public static int diferenciaDosMayores(int[] numeros) {
        Arrays.sort(numeros); // Ordenamos los números de menor a mayor
        return numeros[2] - numeros[1]; // Devolvemos la diferencia entre el último y el segundo número (los más grandes)
    }

    // Método para encontrar el número mayor en el array
    public static int mayorNumero(int[] numeros) {
        int mayor = numeros[0];
        // Iteramos sobre los números en el array para encontrar el mayor
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor; // Devolvemos el número mayor encontrado
    }
}