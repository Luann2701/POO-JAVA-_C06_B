import java.util.Scanner;

public class MainAula2_3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor da NPA do aluno: ");
        int NFA = entrada.nextInt();

        if (NFA < 60) {
            System.out.println("Entre com o valor da NP3 do aluno: ");
            int NP3 = entrada.nextInt();

            float soma = NFA + NP3;
            float média = soma / 2;

            if (média < 50) {
                System.out.println("Aluno Reprovado");
            } else {
                System.out.println("Aluno Aprovado");
            }
        }else {
            System.out.println("Aluno Aprovado");
        }
        }
    }
