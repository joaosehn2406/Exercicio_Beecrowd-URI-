import java.util.Scanner;

public class Ex1151 {

    public Ex1151() {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int N = in.nextInt();
                    
        int num1 = 0;  
        int num2 = 1;  
        int resultado;

        System.out.printf("%d %d ", num1, num2);

        for (int i = 2; i < N; i++) {
            resultado = num1 + num2;
            System.out.printf("%d ", resultado);
            num1 = num2;
            num2 = resultado;
        }

        in.close();
    }

    public static void main(String[] args) {
        new Ex1151();
    }
}
