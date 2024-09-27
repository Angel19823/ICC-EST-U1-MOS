public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion");
        int []arreglo = {10, 5, 8, 2, 0};
        
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        mO.sortBySeleccion(arreglo, true);
        mO.printArreglo(arreglo);

        System.out.println();
        mO.sortBySeleccion(arreglo, false);
        mO.printArreglo(arreglo);
    }
}
