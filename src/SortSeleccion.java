
import java.util.Arrays;

public class SortSeleccion {

    public SortSeleccion() {}

    // Selección descendente (mayor a menor)
    public void sortDescendente(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length; i++) {
            int indiceMayor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[indiceMayor]) {
                    indiceMayor = j;
                }
            }

            if (i != indiceMayor) {
                int aux = numeros[indiceMayor];
                numeros[indiceMayor] = numeros[i];
                numeros[i] = aux;

                if (pasos) {
                    System.out.println("Intercambio índice " + i + " con índice " + indiceMayor);
                    printArray(numeros);
                }
            }
        }
    }

    // Selección ascendente (menor a mayor)
    public void sortAscendente(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (i != indiceMenor) {
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;

                if (pasos) {
                    System.out.println("Intercambio índice " + i + " con índice " + indiceMenor);
                    printArray(numeros);
                }
            }
        }
    }

    // imprimir arreglo de enteros
    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println("]");
    }

    // método general (ya no me sale el error)
    public void sort(int[] numeros, int orden, int pasos) {
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        boolean mostrarPasos = (pasos == 1);

        if (orden == 1) {
            if (mostrarPasos) {
                System.out.println("== Selección Ascendente paso a paso ==");
            }
            sortAscendente(copia, mostrarPasos);
        } else {
            if (mostrarPasos) {
                System.out.println("== Selección Descendente paso a paso ==");
            }
            sortDescendente(copia, mostrarPasos);
        }

        System.out.println("Resultado final:");
        printArray(copia);
    }
}

