public class App {
    public static void main(String[] args) throws Exception {
        // runmetodoBurbuja();
        runMetodoBurbujaAvanzado();
       
    }

    public static void runMetodoBurbujaAvanzado() {
        int[] arreglo = new int[]{50,5,20,30,0,-10,15};
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
    }
}