public class MetodoBurbuja {

    int[] arreglo;

    //constructor vacio
    public MetodoBurbuja(int[]arreglo){
        System.out.println("Se creo la clase Met Burbuja");
        //1RA FORMA
        // INSTANCIAR CON VALOR CREADO EN CONTRUCCION
      //this.arreglo =new int[]{10,5,8,0,7}; 
        // 2DA FORMA
        //INSTANCIAR CON VALOR DESDE PARAMATRO 
        this.arreglo = arreglo;

    }
    public void ordenarAscendente(){
        for (int i=0; i<arreglo.length;i++){
            for (int j = i+1;j<arreglo.length;j++ ){
                if (arreglo[i] > arreglo[j]){
                    int aux= arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j]=aux;

                }
            }
        }
    }
    public void ordenarDescendente(){
        for (int i=0; i<arreglo.length;i++){
            for (int j = i+1;j<arreglo.length;j++ ){
                if (arreglo[i] < arreglo[j]){
                    int aux= arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j]=aux;

                }
            }
        }
    }
    public void imprimirArreglo(){
        for(int num: arreglo){
            System.out.print(num + ", "); //Concatenar
        }
        System.out.println();
        
    }
}
