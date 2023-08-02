package database;

import logic.database;
import concepts.IEnvio;

public class CassandraDB implements database{
    
    @Override
    public void createEnvio(IEnvio envio) {
        System.out.println("Estableciendo el envio... \n\tID ----> " + IEnvio.idEnvio + "\nEstablecido en Cassandra");
    }

    @Override
    public void deleteEnvio(IEnvio envio) {
        System.out.println("Eliminando el envio... \nI\tD ----> " + IEnvio.idEnvio + "\nEliminado de Cassandra");
    }

    @Override
    public void updateEnvio(IEnvio envio, int precio) {
        envio.setPrecio(precio);
        System.out.println("Actualizando el envio... \n\tId ----> " + IEnvio.idEnvio + "\nModificaciones realizadas en Cassandra");
    }
    
}
