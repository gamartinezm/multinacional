package Modelo;

public class Lavadora extends Electrodomestico{
    private String carga;

    public Lavadora() {
    }

    public Lavadora(String carga, String marca, String codigo, int precioBase, int stock) {
        super(marca, codigo, precioBase, stock);
        this.carga = carga;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        if (carga == "Tipo Carga"){
          System.out.println("DEBE SELECCIONAR TIPO DE CARGA");
        } else switch (carga) {
            case "Por arriba":
                this.carga = "A";
                break;
            case "Por el Costado":
                this.carga = "C";
                break;
            default:
                System.out.println("DEBE SELECCIONAR TIPO DE CARGA");
                break;
        }
    }

}
