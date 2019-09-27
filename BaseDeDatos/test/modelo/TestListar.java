package modelo;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {
    
    public TestListar() {
    }
    
    @Test
    public void testListar() {
        System.out.println("Listar");
        BaseDeDatos instance = new BaseDeDatos();
        ArrayList<Dato> esperado = new ArrayList<Dato>();
        ArrayList<Dato> obtenido = instance.listar();
        Assert.assertEquals(esperado, obtenido);
    }
}
