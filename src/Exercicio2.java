import java.util.Scanner;

public class Exercicio2 {
    /*
    Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
    OBS:  Fórmula: IMC = peso/ (altura x altura).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu peso:");
        double peso = scanner.nextDouble();
        System.out.println("Informe a sua altura:");
        double altura = scanner.nextDouble();
        double imc = peso/(altura*altura);
        System.out.printf("O seu imc é de %.2f",imc);

    }
}
