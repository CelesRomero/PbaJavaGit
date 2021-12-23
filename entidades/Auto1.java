package ProbandoParaGit.entidades;

public class Auto1 {

    private String marca;
    private String modelo;
    private Integer anio;

    public Auto1() {
    }

    public Auto1(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Auto1{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + '}';
    }

}

