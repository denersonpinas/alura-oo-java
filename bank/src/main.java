import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String apresentation = """
                || ******************************************************** ||
                    Dados Iniciais do cliente:
                    
                    
                    Nome:           Dênerson Pinas de Souza
                    Tipo conta:     Corrente
                    Saldo inicial:  R$2500,00
               || ******************************************************** ||
                """;
        System.out.println(apresentation);

        // Data this Client
        double balance = 2500.00;
        String firstName = "Dênerson";
        String lastName = "Souza";
        String typeAccount = "Corrente";

        // Inicialization
        Scanner learing = new Scanner(System.in);
        boolean stop = true;
        String menu = """
                
                *** Operações ****
                
                1 - Consultar Saldo
                2 - Depositar Valor
                3 - Sacar Valor
                4 - Sair
                
                Digite a opção desejada:
                """;

        while (stop) {
            System.out.println(menu);
            int option = learing.nextInt();

            if (option == 4) {
                stop = false;
                System.out.println("Encerrando a operação...");
            } else {
                switch (option) {
                    case 1:
                        System.out.println("O saldo atual é de R$: " + balance);
                        break;

                    case 2:
                        System.out.println("""
                            
                            Digite o valor que irá depositar:                            
                            """);
                        double deposit = learing.nextDouble();
                        balance += deposit;
                        System.out.println("Saldo atualizado R$ " + balance);
                        break;

                    case 3:
                        System.out.println("""
                            
                            Digite o valor que irá sacar:                            
                            """);
                        double draw = learing.nextDouble();
                        if (draw <= balance) {
                            balance -= draw;
                            System.out.println("Saldo atualizado R$ " + balance);
                        }
                        System.out.println("Não há saldo suficiente para fazer esse saque.");
                        break;

                    default:
                        System.out.println("Opção inválida...");

                }

            }
        }
    }
}
