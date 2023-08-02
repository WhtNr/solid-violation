package logic;

import concepts.IEnvio;

public class EnvioManagment {

    public static void TiempoEnvio(IEnvio[] envios) {
        for (IEnvio envio : envios) {
            System.out.println("Tiempo de envío: " + envio.getTiempoEnvio() + " horas");
        }
    }

    public static void uploadEnviosDB(IEnvio[] envios, Envio manager) {
        for (IEnvio envio : envios) {
            manager.createEnvio(envio);
        }
    }

}
