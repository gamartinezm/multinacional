package Modelo;

public class Pantalon extends Producto{
    private String tipo;
    private String sexo;

    public Pantalon() {
    }

    public Pantalon(String tipo, String sexo, String codigo, int precioBase, int stock) {
        super(codigo, precioBase, stock);
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == "Jeans" || tipo == "Cotele" || tipo == "Tela") {
        this.tipo = tipo;
        } else {
            System.out.println("DEBE SELECCIONAR TIPO");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (null == sexo) {
            System.out.println("DEBE SELECCIONAR SEXO");
        } else switch (sexo) {
            case "Mujer":
                this.sexo = "M";
                break;
            case "Hombre":
                this.sexo = "H";
                break;
            default:
                System.out.println("DEBE SELECCIONAR SEXO");
                break;
        }
    }
    
    
}
