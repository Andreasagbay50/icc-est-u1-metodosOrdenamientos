public class MetodoSeleccion {
    public void sort(int[] arr){
        int n= arr.length;
        for ( int i = 0; i< n -1 ; i++){
            int indiceDelMenor = i ;
            for (int j = i + 1 ; j< n; j++){
                if (arr[indiceDelMenor]> arr[j]) {
                    indiceDelMenor = j ; 

                }


                }
                if (i != indiceDelMenor) {
                    int aux =arr[i];
                    arr[i] = arr [indiceDelMenor];
                    arr[indiceDelMenor]  = aux;
                }
        }
    }
    public void sortDes(int[] arr){
        int n = arr.length;
        for(int i  = 0; i<n -1 ; i++){
            int indeceDenteMayor = i;
            for (int j = + 1 ; j < n; j++){
                if (arr[indeceDenteMayor] < arr[j]){
                    indeceDenteMayor = j;
                }
            }
            if(i != indeceDenteMayor){
                int aux = arr[i];
                arr[i]= arr[indeceDenteMayor];
                arr[indeceDenteMayor] = aux;

            }

        }
    }
    public void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println();
    }
}