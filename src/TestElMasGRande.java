import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestElMasGRande {

    @Test
    public void testElMasGrandeAlInicio() {
        int[] arr = {5, 2, 3, 4, 1};
        assertEquals(5, ElMAsGrande.elMasGrande(arr));
    }

    @Test
    public void testElMasGrandeEnMedio() {
        int[] arr = {1, 2, 5, 4, 3};
        assertEquals(5, ElMAsGrande.elMasGrande(arr));
    }

    @Test
    public void testElMasGrandeAlFinal() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(5, ElMAsGrande.elMasGrande(arr));
    }

    @Test
    //mismo numero
    public void testElMasGrandeMismoNumero() {
        int[] arr = {1, 1, 1, 1, 1};
        assertEquals(1, ElMAsGrande.elMasGrande(arr));
    }
    
    @Test
    //negativos
    public void testElMasGrandeNegativos() {
        int[] arr = {-1, -2, -3, -4, -5};
        assertEquals(-1, ElMAsGrande.elMasGrande(arr));
    }

    @Test
    //negativos y positivos
    public void testElMasGrandeNegativosPositivos() {
        int[] arr = {-1, -2, 3, 4, 5};
        assertEquals(5, ElMAsGrande.elMasGrande(arr));
    }

    @Test
    //entero mas grande
    public void testElMasGrandeEnteroMasGrande() {
        int[] arr = {Integer.MAX_VALUE, 1, 2, 3, 4};
        assertEquals(Integer.MAX_VALUE, ElMAsGrande.elMasGrande(arr));
    }

    @Test
    //arreglo vacio
    public void testElMasGrandeArregloVacio() {
        int[] arr = {};
        try {
            ElMAsGrande.elMasGrande(arr);
            
        } catch (IllegalArgumentException e) {
            assertEquals("El arreglo no puede estar vacío", e.getMessage());
        }
    }

    @Test 
    //cero incluido en la lista 
    public void testElMasGrandeConCeros( ){
        int[] arr = {0, 1, 2, 3, 4};
        assertEquals(4, ElMAsGrande.elMasGrande(arr));
    }

    @Test
    //un elemento en el arreglo
    public void testElMasGrandeUnElemento(){
        int[] arr = {1};
        assertEquals(1, ElMAsGrande.elMasGrande(arr));
    }

}
