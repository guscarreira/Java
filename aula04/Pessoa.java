public class Pessoa {
    private double altura;
    private int peso;
    private double IMC;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public double getIMC() {
        IMC = peso / (altura*altura);
        return IMC;
    }
}