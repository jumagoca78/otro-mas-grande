import static org.junit.Assert.assertEquals;
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
    
}
