/*
 * Una clase que busca el número más grande de un arreglo
 */

public class ElMAsGrande {
    
    public static int elMasGrande(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;


    }
}
