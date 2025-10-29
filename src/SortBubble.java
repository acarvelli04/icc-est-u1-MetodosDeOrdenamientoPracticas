public class SortBubble {

    // Burbuja ascendente 
    public void sortAscendente(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean huboIntercambio = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    huboIntercambio = true;

                    if (pasos) {
                        System.out.println("Intercambio " + numeros[j + 1] +
                                " con " + numeros[j] +
                                " en posiciones " + j + " y " + (j + 1));
                        printArray(numeros);
                    }
                }
            }
            if (!huboIntercambio) {
                break; 
            }
        }
    }

    // Burbuja descendente 
    public void sortDescendente(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean huboIntercambio = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    huboIntercambio = true;

                    if (pasos) {
                        System.out.println("Intercambio " + numeros[j + 1] +
                                " con " + numeros[j] +
                                " en posiciones " + j + " y " + (j + 1));
                        printArray(numeros);
                    }
                }
            }
            if (!huboIntercambio) {
                break;
            }
        }
    }

    // imprimimos el arreglo en formato [a, b, c]
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
}
