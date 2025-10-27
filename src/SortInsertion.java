
import java.util.Arrays;

public class SortInsertion {

    //ASCENDENTE

    public void sortAscendente(int[] numeros, boolean pasos) {

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

            // insertar el valor aux en su lugar
            numeros[j + 1] = aux;

            if (pasos) {
                System.out.println("Inserto " + aux + " en " + (j + 1));
                printArray(numeros);
            }
        }
    }

   
    //DESCENDENTE
    
    public void sortDescendente(int[] numeros, boolean pasos) {

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

    //ordenar strings a-z

    public void sortByName(String[] nombres, boolean pasos) {

        for (int i = 1; i < nombres.length; i++) {

            String aux = nombres[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("i = " + i + ", j = " + j + ", aux = " + aux);
            }

            // mientras el nombre anterior es "mayor" alfabéticamente
            // aun no entiendo el compareTo

            while (j >= 0 && nombres[j].compareTo(aux) > 0) {

                if (pasos) {
                    System.out.println("Comparo " + aux + " con " + nombres[j]);
                }

                nombres[j + 1] = nombres[j];

                if (pasos) {
                    System.out.println("Muevo " + nombres[j] + " a la posición " + (j + 1));
                    printArray2(nombres);
                }

                j--;
            }

            // inserta el nombre en la posición correcta

            nombres[j + 1] = aux;

            if (pasos) {
                System.out.println("Inserto " + aux + " en " + (j + 1));
                System.out.println("Estado actual:");
                printArray2(nombres);
            }
        }
    }

    // personas alfabeticamente por nombre

    public void sortPersonasByName(Persona[] personas) {

        for (int i = 1; i < personas.length; i++) {

            Persona aux = personas[i];
            int j = i - 1;

            // mover mientras el nombre anterior sea "mayor"
            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    // personas menor a mayor edad

    public void sortPersonasByAge(Persona[] personas) {

        for (int i = 1; i < personas.length; i++) {

            Persona aux = personas[i];
            int j = i - 1;

            // mover mientras la edad anterior sea mayor
            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    // imprimicion array enteros
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

    // imprimicion array strings

    public void printArray2(String[] nombres) {
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            if (i == nombres.length - 1) {
                System.out.print(nombres[i]);
            } else {
                System.out.print(nombres[i] + ", ");
            }
        }
        System.out.println("]");
    }

    // imprimicion array personas

    public void printArrayPersonas(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getName() +
                               ", Edad: " + personas[i].getAge());
        }
    }

    
    // COPIAR ARREGLOS (para no cambiar el original)
    // la investigacion fue un infierno
    
    public int[] copiar(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public String[] copiar(String[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public Persona[] copiar(Persona[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
}

