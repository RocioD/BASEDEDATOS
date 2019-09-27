package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {
    
    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Dato dato = new Dato("Dato01", new Object());
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        instance.agregar(dato);
        boolean obtenido = instance.modificar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
