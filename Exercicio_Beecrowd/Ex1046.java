import java.util.Scanner;

public class Ex1046 {

    public Ex1046() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int start = in.nextInt();
        System.out.println("Digite outro numero: ");
        int end = in.nextInt();
        int resulstado = Math.abs(start - 24) + end;
        System.out.printf("O JOGO DUROU %d HORA(S)", resulstado);
        in.close();
    }

    public static void main(String[] args) {
        new Ex1046();
    }
}
