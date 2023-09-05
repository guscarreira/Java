import java.util.Scanner;

public class aula04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Pessoa p = new Pessoa();
            System.out.println("Digite seu peso: ");
            int peso = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            p.setPeso(peso);
            p.setAltura(altura);

            double imc = p.getIMC();
            System.out.printf("IMC: %.2f" , imc);
        }

    }
}
