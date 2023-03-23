import java.util.Scanner;

public class exerciciorevisaoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];
        double[][] contas = new double[4][4];

        for (int i = 0; i < 3; i++) {
            System.out.println("digite o "+ (i + 1) +"° nome:");
            nomes[i] = scanner.next();

        }
        exibevetor(nomes);

    }
    public static void exibevetor(String[] nomes) {

        //   for (String nome : nomes) {
        //       System.out.printf(nome + "" );{
        //

        //}

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf(nomes[i] + " ");

        }
    }
        public static void exibirmatriz(double [][] contas){
            for (int i = 0; i < contas.length; i++) {
                for (int j = 0; j < contas.length; j++) {
                    System.out.printf(contas[i][j] + " ");

                }
                System.out.println("");

            }
        }

        }
