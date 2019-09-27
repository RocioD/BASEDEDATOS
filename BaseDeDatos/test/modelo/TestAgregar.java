package modelo;

import org.junit.Assert;
import org.junit.Test;


public class TestAgregar {
    
    public TestAgregar() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Dato dato = new Dato("Dato01", new Object());
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        boolean obtenido = instance.agregar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
