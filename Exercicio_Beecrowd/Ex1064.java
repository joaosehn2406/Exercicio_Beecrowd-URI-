    package Exercicios_Beecrowd;

    import java.util.Scanner;

    public class Ex1064 {

        public Ex1064() {

            Scanner in = new Scanner(System.in);

           float X;
           int contagem = 0;
           float soma = 0;
           

            for(int i = 0; i < 6; i++) {
                X = in.nextFloat();
                if( X > 0 ) {
                    contagem++;
                    soma += X;
                    
                }
            }
            soma /= contagem;
            System.out.printf("%d valores positivos\n%.1f\n", contagem, soma);
            
            in.close();
        }

        public static void main(String[] args) {
            new Ex1064();
        }
    }
