import java.util.Scanner;

public class Ex1129 {

    public Ex1129() {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); 
        in.nextLine(); 

        while (N != 0) {
            for (int i = 0; i < N; i++) {

                int total = 0;
                String correta = "";

                int A = in.nextInt();
                int B = in.nextInt();
                int C = in.nextInt();
                int D = in.nextInt();
                int E = in.nextInt();
    
                if (A <= 127) {
                    correta = "A";
                    total++;
                }
                if (B <= 127) {
                    correta = "B";
                    total++;
                }
                if (C <= 127) {
                    correta = "C";
                    total++;
                }
                if (D <= 127) {
                    correta = "D";
                    total++;
                }
                if (E <= 127) {
                    correta = "E";
                    total++;
                }
                if (total == 1) {
                    System.out.println(correta);
                } else {
                    System.out.println("*");
                }
            }
            N = in.nextInt(); 
            in.nextLine(); 
        }
        
        in.close();
    }

    public static void main(String[] args) {
        new Ex1129();
    }
}
