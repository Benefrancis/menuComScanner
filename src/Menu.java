import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String mensagem = """
                Bem-vindo a operadora Java 
                                
                Digite: 
                                
                1 - Receber um desconto
                2 - Para receber desconto em dobro
                3 - Para pagar o dobro
                4 - Para pagar o triplo
                                
                0 - Para sair do sistema
                """;
        System.out.println(mensagem);
        byte opcao = leitor.nextByte();

        while (opcao > 0) {
            switch (opcao) {
                case 1 -> System.out.println("Você recebeu um desconto!");
                case 2 -> System.out.println("Parabéns você recebeu desconto em dobro!");
                case 3 -> System.out.println("Ops você vai pagar o dobro");
                case 4 -> System.out.println("Que azar heim!!! Vai pagar o triplo");
                default -> System.exit(0);
            }
            System.out.println(mensagem);
            opcao = leitor.nextByte();
        }
    }
}
