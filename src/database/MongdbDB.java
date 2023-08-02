package database;

import logic.database;
import concepts.IEnvio;

public class MongdbDB implements database{
   
    @Override
    public void createEnvio(IEnvio envio) {
        System.out.println("Estableciendo el envio... \nID ----> " + IEnvio.idEnvio + "\nEstablecido en MongoDB");
    }

    @Override
    public void deleteEnvio(IEnvio envio) {
        System.out.println("Eliminando el envio... \nID ----> " + IEnvio.idEnvio + "\nEliminado de MongoDB");
    }

    @Override
    public void updateEnvio(IEnvio envio, int precio) {
        envio.setPrecio(precio);
        System.out.println("Actualizando el envio... \nId ----> " + IEnvio.idEnvio + "Modificaciones realizadas en MongoDB");
    }
    
}
