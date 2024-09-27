public class MetodoOrdenamiento {

    public int[] sortBySeleccion(int[] arreglo, boolean asendente){
        int tamano = arreglo.length;

        //Recorre el arreglo
        for (int i = 0; i < tamano; i++) {
            int indice = i;
            for (int j = i+1; j < tamano; j++) {
                if (asendente) {
                    if(arreglo[j] < arreglo[indice]){
                        indice= j;
                    }
                }else{
                    if(arreglo[j] > arreglo[indice]){
                        indice= j;
                    }
                }
                //PRGO TIP
                
                //if(asendente
                //? arreglo[j] < arreglo[indice]
                //: arreglo[j] > arreglo[indice]){
                //    indice=j;
                //}
                
            }
            //Intercambio de indice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }
    public void printArreglo (int[] arreglo){
        for (int elemento : arreglo) {
            System.out.print(elemento+" ");
        }
    }

}
