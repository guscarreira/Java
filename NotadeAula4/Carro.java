public class Carro {
    String marca, modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    public String mostrarDetalhes() {
        return "Marca: " + marca + " \nModelo: " + modelo; // Adicionei um espaço após "Marca:" e "Modelo:"
    }
}