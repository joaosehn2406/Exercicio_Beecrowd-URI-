import java.util.Scanner;

public class Ex1042 {

    public Ex1042() {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num3 > num1 && num1 > num2) {
            System.out.printf("%d%n %d%n %d%n", num2, num1, num3);
        } else if (num2 > num3 && num3 > num1) {
            System.out.printf("%d%n %d%n %d%n", num1, num3, num2);
        } else {
            System.out.printf("%d%n %d%n %d%n", num3, num2, num1);
        }

        System.out.printf("%d%n %d%n %d%n", num1, num2, num3);
        in.close();
    }

    public static void main(String[] args) {
        new Ex1042();
    }
}
