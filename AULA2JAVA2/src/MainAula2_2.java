import java.util.Scanner;

public class MainAula2_2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o 1° valor: ");
        int x = entrada.nextInt();
        System.out.println("Entre com o 2° valor: ");
        int y = entrada.nextInt();
        System.out.println("Entre com o 3° valor: ");
        int z = entrada.nextInt();
        int soma = x+y+z;
        float media = (float) soma/3;

        System.out.println("A média de lanches consumidos nessas 3 horas foi: "+ (media));
        System.out.println("A Soma de lanches consumidos nessas 3 horas foi: "+ (soma));
    }
}