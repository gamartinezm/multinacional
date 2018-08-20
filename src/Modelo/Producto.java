package Modelo;

public abstract class Producto {
    private String codigo;
    private int precioBase;
    private int stock;

    public Producto() {
    }

    public Producto(String codigo, int precioBase, int stock) {
        this.codigo = codigo;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        if (precioBase > 0) {
            this.precioBase = precioBase;
        } else {
            System.out.println("PRECIO DEBE SER MAYOR A CERO");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("STOCK DEBE SER MAYOR O IGUAL A CERO");
        }  
    }

}
