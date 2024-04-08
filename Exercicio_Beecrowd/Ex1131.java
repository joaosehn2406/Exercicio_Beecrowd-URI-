import java.util.Scanner;

public class Ex1131 {

    public Ex1131() {

        Scanner in = new Scanner(System.in);

        int golGremio;
        int golInter;
        int empates = 0;
        int resultadoInter = 0;
        int resultadoGremio = 0;
        int partidas = 0;
        int resposta;

        do {
            partidas++;
            golGremio = in.nextInt();
            golInter = in.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            resposta = in.nextInt();

            if (golGremio > golInter) {
                resultadoGremio++;
            } else if (golInter > golGremio) {
                resultadoInter++;
            } else {
                partidas++;
            }

            System.out.printf("%d grenais\n", partidas);
            System.out.printf("Inter:%d\n", resultadoGremio);
            System.out.printf("Gremio:%d\n", resultadoGremio);
            System.out.printf("Empates:%d\n", empates);

            if (resultadoGremio > resultadoInter) {
                System.out.println("Gremio venceu mais");
            } else if (resultadoInter > resultadoGremio) {
                System.out.println("Inter venceu mais");
            } else {
                System.out.println("Nao houve vencedor");
            }
        } while (resposta != 2);
        in.close();
    }

    public static void main(String[] args) {
        new Ex1131();
    }
}
