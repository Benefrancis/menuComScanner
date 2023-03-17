import java.util.Scanner;

public class IfTernario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a sua nota final");
        var notaFinal = leitor.nextFloat();

        boolean aprovado = notaFinal > 5 ? true : false;
        String mensagem = aprovado ? "Parabéns" : "Você precisa estudar";
        System.out.println(mensagem);
        leitor.close();
    }
}