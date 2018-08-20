package Modelo;

public class Refrigerador extends Electrodomestico{
    private int cantidadPies;

    public Refrigerador() {
    }

    public Refrigerador(int cantidadPies, String marca, String codigo, int precioBase, int stock) {
        super(marca, codigo, precioBase, stock);
        this.cantidadPies = cantidadPies;
    }

    public int getCantidadPies() {
        return cantidadPies;
    }

    public void setCantidadPies(int cantidadPies) {
        this.cantidadPies = cantidadPies;
    }
    
    
}
