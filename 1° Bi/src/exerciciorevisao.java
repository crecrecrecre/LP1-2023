import java.util.Scanner;
public class exerciciorevisao {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        String [] nomes = new String[3];
        double [][] contas = new double [4][4];
        int opcao;
        double [] valor = new double [3];


        for(int cont = 0; cont < 3; cont++){
            System.out.println("Digite o seu nome: ");
            nomes[cont] = leitor.nextLine();
        }

        exibeString(nomes);
        System.out.println(" ");

        for (int cont2 = 0; cont2 < 4; cont2++) {
            System.out.println("Digite uma opção: ");
            opcao = leitor.nextInt();
            //opcao = leitor.next().charAt(0);
            verificaNum(opcao,nomes);
        }

        for (int cont3 = 0; cont3 < 3; cont3++) {
            System.out.println("Digite o " + (cont3 + 1) + "° valor");
            valor[cont3] = leitor.nextDouble();
        }

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (linha == 0){
                    contas[0][1] = valor[0];
                    contas[0][2] = valor[1];
                    contas[0][3] = valor[2];
                }else if (coluna == 0){
                    contas[1][0] = valor[0];
                    contas[2][0] = valor[1];
                    contas[3][0] = valor[2];
                }else if(linha == coluna){
                    contas[linha][coluna] = valor[coluna - 1] * valor[coluna - 1];
                }else if (linha == 1 && coluna == 2 || coluna == 3){
                    contas[1][2] = valor[0] - valor[1];
                    contas[1][3] = valor[0] - valor[2];
                }else if (linha == 2 && coluna == 1 || coluna == 3){
                    contas[2][1] = valor[1] - valor[0];
                    contas[2][3] = valor[1] - valor[2];
                }else if (linha == 3 && coluna == 1 || coluna == 2){
                    contas[3][1] = valor[2] - valor[0];
                    contas[3][2] = valor[2] - valor[1];
                }
            }
        }

        exibeDouble(contas);
    }

    public static void exibeString(String [] nomes){
        for(int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
        }
    }

    public static void exibeDouble (double [] [] contas) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf(contas [i][j] + " | ");
            }
            //System.out.println(" ");
            System.out.printf("\n");
        }
    }

    /*public static String verificaNum (int opcao, String [] nomes){
        if (opcao == 1){
            return nomes[0];
        }else if (opcao >= 2 && opcao <= 10){
            return nomes[1];
        }else if (opcao > 10){
            return nomes[2];
        }
        return "Opcao invalida";
    }*/

    public static void verificaNum (int opcao, String [] nomes){
        if (opcao == 1){
            System.out.println(nomes[0]);
        }else if (opcao >= 2 && opcao <= 10){
            System.out.println(nomes[1]);
        }else if (opcao > 10){
            System.out.println(nomes[2]);
        }else{
            System.out.println("Opção inválida!");
        }

    }

}
