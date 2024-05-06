import java.util.Scanner;

public class Ex1155 {

    public Ex1155() {
        Scanner in = new Scanner(System.in);

        double soma = 1; 

        for (int denominador = 2; denominador <= 100; denominador++) {
            double divisao = 1.0 / denominador; 
            soma += divisao; 
        }

        System.out.printf("%.2f%n", soma);

        in.close();
    }

    public static void main(String[] args) {
        new Ex1155();
    }
}
