package main;

import concepts.IEnvio;
import concepts.Internacional;
import concepts.Municipal;
import database.CassandraDB;
import logic.Envio;
import logic.EnvioManagment;

public class Principal {

    public static void main(String[] args) {

        Envio envio = new Envio(new CassandraDB());

        IEnvio[] envios = {
            new Municipal(1, 5000),
            new Internacional(2, 25000)
        };

        EnvioManagment.TiempoEnvio(envios);

        EnvioManagment.uploadEnviosDB(envios, envio);

        envio.updatePrecio(envios[1], 38000);
        System.out.println("\n\nPrecio Actualizado:\t" + envios[1].getPrecio());
    }

}

