package Modelo;

public abstract class Electrodomestico extends Producto{
    private String marca;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String codigo, int precioBase, int stock) {
        super(codigo, precioBase, stock);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() >= 2) {
            this.marca = marca;
        }else {
            System.out.println("DEBE TENER MINIMO DOS CARACTERES");
        }
    }
    
    
}
