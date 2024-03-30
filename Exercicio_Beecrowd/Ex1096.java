package Exercicio_Beecrowd;

public class Ex1096 {
    public Ex1096() {
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 7; j >= 5; j--) {
                System.out.printf("I=%d J=%d\n", i, j);
            }
        }
    }

    public static void main(String[] args) {
        new Ex1096();
    }
}
