public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion");
        int []arreglo = {10, 5, 9, 3, 1};
        
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        mO.sortBySeleccion(arreglo);
        mO.printArreglo(arreglo);
    }
}
