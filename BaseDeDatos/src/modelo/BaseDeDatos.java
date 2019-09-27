package modelo;

import java.util.ArrayList;


public class BaseDeDatos {

    private ArrayList<Dato> datos;
    
    public BaseDeDatos() {
        datos = new ArrayList<Dato>();
    }
    
    public boolean agregar(Dato d) {
        System.out.println("Agrega un objeto a la base de datos emulada");
        return datos.add(d);
        
    }

    public boolean eliminar(Dato d) {
        System.out.println("Elimina un objeto de la base de datos emulada.");
        for(int i=0;i<datos.size();i++){
            if(datos.get(i).getId().equals(d.getId())){
                datos.remove(i);
                return true; 
            }            
        }
        return false;
    }
    public ArrayList<Dato> listar(){
        System.out.println("Retorna una lista con todos los objetos de la base de datos emulada.");
        return this.datos;
    }
    
    public boolean modificar(Dato d) {
        System.out.println("Modifica un objeto de la base de datos emulada.");
        for(int i=0;i<datos.size();i++){
            if(datos.get(i).getId().equals(d.getId())){
                datos.get(i).setId(d.getId()); // es optativo
                datos.get(i).setData(d.getData());
                return true; 
            }            
        }
        return false;
    }


}