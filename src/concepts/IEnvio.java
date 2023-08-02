package concepts;

public interface IEnvio {

    void cargarMercancia();

    void rastrearPaquete();

    int getTiempoEnvio();

    int getPrecio();

    void setPrecio(int precio);

    int idEnvio = 1545;
}
