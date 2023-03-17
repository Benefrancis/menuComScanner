import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float ps, tcc, av1, av2;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota da Prova Semestral");
        ps = leitor.nextFloat();

        System.out.println("Informe a nota do TCC");
        tcc = leitor.nextFloat();

        System.out.println("Informe a nota da AV1");
        av1 = leitor.nextFloat();

        System.out.println("Informe a nota da AV2");
        av2 = leitor.nextFloat();

        leitor.close();

        double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2) / 2) * 0.2;

        if (mediaFinal >= 6)
            System.out.println("Aprovado");
        else if (mediaFinal >= 3)
            System.out.println("Está de exame");
        else
            System.out.println("reprovado");
    }
}