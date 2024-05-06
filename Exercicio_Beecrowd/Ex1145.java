import java.util.Scanner;

public class Ex1145 {

    public Ex1145() {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Y = in.nextInt();

        int cont = 1;
        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            if (cont % X == 0) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
            cont++;
        }

        in.close();
    }

    public static void main(String[] args) {
        new Ex1145();
    }
}
