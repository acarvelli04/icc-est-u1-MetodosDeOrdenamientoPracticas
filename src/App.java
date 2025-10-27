public class App {
    public static void main(String[] args) throws Exception {
        
        View view = new View();
        // view.showMenu();
        // view.inputOption(4);

        int [] numeros = new int [] {12,45,8,6,7}; 
        SortSeleccion sortSeleccion = new SortSeleccion();
        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            switch (option) {
                case 1:
                System.out.println("\n Metodo Seleccion");
                int orden = view.inputOption(2);
                boolean ordenOpt = orden == 1;
                view.showPasosMenu();
                int pasos = view.inputOption(2);
                // boolean ordenOpt = orden == 1;
                SortSeleccion sortSelection = new SortSeleccion();
                sortSelection.sort(numeros, orden,pasos);
                
                    break;
                
                case 2:
                System.out.println("\n Metodo Insercion");
                sortInsertion.sort();
                    break;

                case 3:
                System.out.println("\n Metodo Burbuja");
                    
                    break;
                
                case 4:
                System.out.println("\n ---Adios----");
                System.exit(option);
                    break;
            
                default:
                    break;
            }
        }
    }
}