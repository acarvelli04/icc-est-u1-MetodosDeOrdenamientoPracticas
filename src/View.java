import java.util.Scanner;
/** EL proposito de view es poder mostrarle al usuario las opciones 
 * y asi que escoga alguna
*/
public class View {
    // Scanner global para leer la entrada del usuario
    private final Scanner scanner;

    public View() {
        System.out.println("Métodos de Ordenamiento");
        scanner = new Scanner(System.in);
    }

    // Menú principal
    public void showMenu() {
        System.out.println("\n-- Menú Métodos --");
        System.out.println("1 --> Selección");
        System.out.println("2 --> Inserción");
        System.out.println("3 --> Burbuja");
        System.out.println("4 --> Salir");
        System.out.print("Seleccione la opción: ");
    }

    // validación entre 1 y max
    public int inputOption(int max) {
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 1 && option <= max) {
                    break;
                }
            } else {
                scanner.next(); // limpiar basura
            }
            System.out.print("Opción inválida, ingrese otra vez: ");
        }
        return option;
    }

    // Menú de orden
    public void showOrdenMenu() {
        System.out.println("\n-- Orden --");
        System.out.println("1 -> Ascendente");
        System.out.println("2 -> Descendente");
        System.out.print("Seleccione la opción: ");
    }

    // Menú de los pasos pasos
    public void showPasosMenu() {
        System.out.println("\n-- ¿Mostrar pasos? --");
        System.out.println("1 -> Sí, paso a paso");
        System.out.println("2 -> No, solo resultado final");
        System.out.print("Seleccione la opción: ");
    }
}

