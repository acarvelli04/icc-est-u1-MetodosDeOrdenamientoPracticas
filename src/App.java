import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        View view = new View();

        // arreglo de numeros original
        int[] numeros = new int[]{ 19, 24, -19, -28, 5, 30, -12, 34, -9, 52, 0, 45 };

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            switch (option) {
                case 1:
                    System.out.println("\n----Método Selección----");

                    System.out.println("Orden:");
                    view.showOrdenMenu();
                    int ordenSel = view.inputOption(2); // 1 ascendente, 2 descendente

                    System.out.println("¿Mostrar pasos?");
                    view.showPasosMenu();
                    int pasosSel = view.inputOption(2); // 1 sí, 2 no
                    boolean mostrarPasosSel = (pasosSel == 1);

                    SortSeleccion sel = new SortSeleccion();
                    int[] copiaSel = Arrays.copyOf(numeros, numeros.length);

                    if (ordenSel == 1) {
                        if (mostrarPasosSel) {
                            System.out.println("---Selección Ascendente paso a paso---");
                        }
                        sel.sortAscendente(copiaSel, mostrarPasosSel);
                    } else {
                        if (mostrarPasosSel) {
                            System.out.println("---Selección Descendente paso a paso---");
                        }
                        sel.sortDescendente(copiaSel, mostrarPasosSel);
                    }

                    System.out.println("Resultado final:");
                    sel.printArray(copiaSel);
                    break;

                case 2:
                    System.out.println("\n----Método Inserción----");

                    System.out.println("Orden:");
                    view.showOrdenMenu();
                    int ordenIns = view.inputOption(2);

                    System.out.println("¿Mostrar pasos?");
                    view.showPasosMenu();
                    int pasosIns = view.inputOption(2);
                    boolean mostrarPasosIns = (pasosIns == 1);

                    SortInsertion insertion = new SortInsertion();
                    int[] copiaIns = Arrays.copyOf(numeros, numeros.length);

                    if (ordenIns == 1) {
                        insertion.sortAscendente(copiaIns, mostrarPasosIns);
                    } else {
                        insertion.sortDescendente(copiaIns, mostrarPasosIns);
                    }

                    System.out.println("Resultado final:");
                    insertion.printArray(copiaIns);
                    break;

                case 3:
                    System.out.println("\n----Método Burbuja----");

                    System.out.println("Orden:");
                    view.showOrdenMenu();
                    int ordenBub = view.inputOption(2);

                    System.out.println("¿Mostrar pasos?");
                    view.showPasosMenu();
                    int pasosBub = view.inputOption(2);
                    boolean mostrarPasosBub = (pasosBub == 1);

                    SortBubble bubble = new SortBubble();
                    int[] copiaBub = Arrays.copyOf(numeros, numeros.length);

                    if (ordenBub == 1) {
                        bubble.sortAscendente(copiaBub, mostrarPasosBub);
                    } else {
                        bubble.sortDescendente(copiaBub, mostrarPasosBub);
                    }

                    System.out.println("Resultado final:");
                    bubble.printArray(copiaBub);
                    break;

                case 4:
                    System.out.println("\n---Adios---");
                    return;

                default:
                    break;
            }
        }
    }
}

