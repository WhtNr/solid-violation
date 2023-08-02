package concepts;

public class Municipal implements IEnvio{
    
    int id;
    int precio;
    int tiempoEntrega = 12;

    public Municipal(int id, int precio) {
        this.id = id;
        this.precio = precio;
    }

    @Override
    public void cargarMercancia() {

    }

    @Override
    public void rastrearPaquete() {

    }

    @Override
    public int getTiempoEnvio() {
        return this.tiempoEntrega;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
