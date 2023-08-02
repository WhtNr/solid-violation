package logic;

import concepts.IEnvio;

public class Envio {

    database db;

    public Envio(database db) {
        this.db = db;
    }

    public void createEnvio(IEnvio envio) {
        db.createEnvio(envio);
    }

    public void deleteEnvio(IEnvio envio){
        db.deleteEnvio(envio);
    }

    public void updatePrecio(IEnvio envio, int precio){
        db.updateEnvio(envio, precio);
    }
  
}