
import java.util.Arrays;

public class SortInsertion {

    // Inserción ascendente
    public void sortAscendente(int[] numeros, boolean pasos) {
        System.out.println("== Inserción Ascendente ==");
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("i = " + i + ", j = " + j + ", aux = " + aux);
            }

            while (j >= 0 && numeros[j] > aux) {
                if (pasos) {
                    System.out.println("Comparo " + aux + " con " + numeros[j]);
                }
                numeros[j + 1] = numeros[j];
                if (pasos) {
                    System.out.println("Muevo " + numeros[j] + " a la posición " + (j + 1));
                    printArray(numeros);
                }
                j--;
            }

            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserto " + aux + " en " + (j + 1));
                printArray(numeros);
            }
        }
    }

    // Inserción descendente 
    public void sortDescendente(int[] numeros, boolean pasos) {
        System.out.println("== Inserción Descendente ==");
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("i = " + i + ", j = " + j + ", aux = " + aux);
            }

            while (j >= 0 && numeros[j] < aux) {
                if (pasos) {
                    System.out.println("Comparo " + aux + " con " + numeros[j]);
                }
                numeros[j + 1] = numeros[j];
                if (pasos) {
                    System.out.println("Muevo " + numeros[j] + " a la posición " + (j + 1));
                    printArray(numeros);
                }
                j--;
            }

            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserto " + aux + " en " + (j + 1));
                printArray(numeros);
            }
        }
    }

    // Inserción para Strings alfabeticamente
    public void sortByName(String[] nombres, boolean pasos) {
        System.out.println("== Inserción por Nombre (A-Z) ==");
        for (int i = 1; i < nombres.length; i++) {
            String aux = nombres[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("i = " + i + ", j = " + j + ", aux = '" + aux + "'");
            }

            while (j >= 0 && nombres[j].compareTo(aux) > 0) {
                if (pasos) {
                    System.out.println("Comparo '" + aux + "' con '" + nombres[j] + "'");
                }
                nombres[j + 1] = nombres[j];
                if (pasos) {
                    System.out.println("Muevo '" + nombres[j] + "' a la posición " + (j + 1));
                    printArray(nombres);
                }
                j--;
            }

            nombres[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserto '" + aux + "' en " + (j + 1));
                printArray(nombres);
            }
        }
    }

    // Imprimimos arreglo de enteros
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

    // Imprimimos arreglo de Strings
    public void printArray(String[] nombres) {
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            if (i == nombres.length - 1) {
                System.out.print("\"" + nombres[i] + "\"");
            } else {
                System.out.print("\"" + nombres[i] + "\"" + ", ");
            }
        }
        System.out.println("]");
    }

    // con esto podemos copiar el arreglo original
    public int[] copiar(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public String[] copiar(String[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
}

