package database;

import logic.database;
import concepts.IEnvio;

public class AzureDB implements database{

    @Override
    public void createEnvio(IEnvio envio) {
        System.out.println("Estableciendo el envio... \nID ----> " + IEnvio.idEnvio + "\nEstablecido en Azure");
    }

    @Override
    public void deleteEnvio(IEnvio envio) {
        System.out.println("Eliminando el envio... \nID ----> " + IEnvio.idEnvio + "\nEliminado de Azure");
    }

    @Override
    public void updateEnvio(IEnvio envio, int precio) {
        envio.setPrecio(precio);
        System.out.println("Actualizando el envio... \nId ----> " + IEnvio.idEnvio + "Modificaciones realizadas en Azure");
    }
    
}
