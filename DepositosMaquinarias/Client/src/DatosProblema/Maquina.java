package DatosProblema;

public class Maquina {
    String nroDeSerie = "";
    String modelo = "";
    int año = 0;
    Float precio = new Float(0.0f);
    
    public Maquina(String nroSerie, String modelo, int año) {
        super();
        this.nroDeSerie = nroSerie;
        this.modelo = modelo;
        this.año = año;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getPrecio() {
        return precio;
    }
}
