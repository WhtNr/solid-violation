package logic;

import concepts.IEnvio;

public interface database {
    
    void createEnvio(IEnvio envio);

    void updateEnvio(IEnvio envio, int precio);

    void deleteEnvio(IEnvio envio);

}
