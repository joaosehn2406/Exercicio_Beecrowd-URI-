package Exercicio_Beecrowd;



import java.util.Scanner;

public class Ex1116 {

    public Ex1116() {

        Scanner in = new Scanner(System.in);

        int qntd = in.nextInt();
        
        
        for( int i = 0; i < qntd; i++) {
            float num1 = in.nextFloat();
            float num2 = in.nextFloat();
            float calculo = num1 / num2;

            if( num2 == 0) {
                System.out.println("divisao impossivel");
            } else {
            System.out.printf("%.1f", calculo);
            }
        }
        
        in.close();
    }

    public static void main(String[] args) {
        new Ex1116();
    }
}
