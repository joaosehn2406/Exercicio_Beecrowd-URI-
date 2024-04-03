import java.util.Scanner;

public class Ex1035 {

    public Ex1035() {

        Scanner in = new Scanner(System.in);

        int A, B, C, D;
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        int soma1 = C + D;
        int soma2 = A + B;

        if (B > C && D > A && soma1 > soma2 && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Ex1035();
    }
}
