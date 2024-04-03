import java.util.Scanner;

public class Ex1037 {

    public Ex1037() {

        Scanner in = new Scanner(System.in);

        float n1 = in.nextFloat();

        if (n1 >= 0 && n1 <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if (n1 >= 25.00001 && n1 <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        } else if (n1 >= 50.00001 && n1 <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        } else if (n1 >= 75.00001 && n1 <= 100.0000000) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Ex1037();
    }
}
