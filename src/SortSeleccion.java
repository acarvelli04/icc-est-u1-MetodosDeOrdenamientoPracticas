
public class SortSeleccion {
    public SortSeleccion(){

    }  

    public void sortDesendente(int[]numeros){
        int indiceMenor=0;
        int aux=0;
        for (int i = 0; i < numeros.length; i++) {
            indiceMenor=i;
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j]>numeros[indiceMenor]) {
                    indiceMenor=j;
                }
            }

            if (i != indiceMenor) {
                aux=numeros[indiceMenor];
                numeros[indiceMenor]=numeros[i];
                numeros[i]=aux;
            }

        }
    }

    public void sortAscendente(int[]numeros){
        int indiceMenor=0;
        int aux=0;
        for (int i = 0; i < numeros.length; i++) {
            indiceMenor=i;
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j]<numeros[indiceMenor]) {
                    indiceMenor=j;
                }
            }

            if (i != indiceMenor) {
                aux=numeros[indiceMenor];
                numeros[indiceMenor]=numeros[i];
                numeros[i]=aux;
            }

        }
    }

    public void printArray(int[] numeros) {
        System.out.print("["); 
                for (int i = 0; i< numeros.length; i++) {
                    if (i==numeros.length-1) {
                        System.out.print(numeros[i]+"");
                    } else {
                        System.out.print(numeros[i]+", ");
                    }
                
                }
                System.out.print("]"); 
            
        
    }

    public void sort(int[] numeros, int orden, int pasos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    } 

    
}
