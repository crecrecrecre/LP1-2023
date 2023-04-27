/*
Lê 5 nomes e notas de uma turma,
calcula e exibe a média das notas da turma e em seguida
exibe a relação de nomes cuja nota é superior a esta média
 */
import java.util.Scanner;

public class ex{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        String [] nomes = new String [5];
        float [] notas = new float [5];
        float media=0;


        for (int i=0 ; i < 5 ; i++ ) {
            System.out.println ( "insira o nome do " + (i+1) + "° aluno: ");
            nomes[i]=scanner.next();
            System.out.println("agora insira a nota dele: ");
            notas[i]=scanner.nextFloat();

            media = media + notas[i];


        }

        media = media/5;

        System.out.println("A media da turma foi "+ media);



        for (int j=0 ; j < 5 ; j++ ) {
            if (notas[j] >= media ){
                System.out.printf("aluno(a) %s foi acima da media! ", nomes[j]);
                System.out.println("sua nota foi: " + notas [j]);
            }
        }


    }




    public static void exibenomes (String [] nomes){

        for ( int i = 0 ; i < 5 ; i++ ) {
            System.out.println(nomes[i]);
        }
    }

}