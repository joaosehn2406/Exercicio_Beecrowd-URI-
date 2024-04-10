import java.util.Scanner;

public class Ex1143 {

    public Ex1143() {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {

            double exponen = (int) Math.pow(i, 2);
            double exponen1 = (int) Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f\n", i, exponen, exponen1);
        }

        in.close();
    }

    public static void main(String[] args) {
        new Ex1143();
    }
}
