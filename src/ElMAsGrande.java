/*
 * Una clase que busca el número más grande de un arreglo
 */

public class ElMAsGrande {
    
    public static int elMasGrande(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }

        int max = Integer.MIN_VALUE; //arr[0]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;


    }
}
