package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {
    
    public TestEliminar() {
    }
    
    @Test
    public void TestEliminar() {
        System.out.println("Eliminar");
        Dato dato = new Dato("Dato01", new Object());
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        instance.agregar(dato);
        boolean obtenido = instance.eliminar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
