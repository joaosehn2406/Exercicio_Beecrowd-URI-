    package Exercicios_Beecrowd;

    import java.util.Scanner;

    public class Ex1149 {

        public Ex1149() {

            Scanner in = new Scanner(System.in);

            int A = in.nextInt();
            int N = in.nextInt();
            int soma = 0;

            while (N <= 0) {
                N = in.nextInt();
            }
            for (int i = 1; i <= N; i++) {
                soma += A;
                A++;

            }
            System.out.println(soma);

            in.close();
        }

        public static void main(String[] args) {
            new Ex1149();
        }
    }
