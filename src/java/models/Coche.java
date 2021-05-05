package models;

public class Coche {

    private int idcoche;
    private String marca;
    private String modelo;
    private String conductor;
    private String imagen;

    public Coche() {
    }

    public Coche(int idcoche, String marca, String modelo, String conductor, String imagen) {
        this.idcoche = idcoche;
        this.marca = marca;
        this.modelo = modelo;
        this.conductor = conductor;
        this.imagen = imagen;
    }

    public int getIdcohe() {
        return idcoche;
    }

    public void setIdcohe(int idcohe) {
        this.idcoche = idcohe;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
