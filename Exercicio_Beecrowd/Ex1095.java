package Exercicio_Beecrowd;

public class Ex1095 {

    public Ex1095() {

        int I = 1;
        int J = 60;

        for (int i = 1; i <= 13; i++) {
            System.out.printf("I=$d J=%d%n", I, J);
            I += 3;
            J -= 5;

        }
    }

    public static void main(String[] args) {
        new Ex1095();
    }

}
