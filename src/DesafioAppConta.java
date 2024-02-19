import java.util.Scanner;

public class DesafioAppConta {

    public static void main(String[] args) {

        String nomeCliente = " Alfredo Lopes";
        String tipoConta = "Conta corrente";
        double saldoConta = 20;

        System.out.println("******************************");
        System.out.println("\nNome do Cliente : " + nomeCliente);
        System.out.println("Tipo de Conta : " + tipoConta);
        System.out.println("Saldo em Conta : " + saldoConta);
        System.out.println("\n******************************");

        String menu = """
                Digite uma Opção :
                1 - Consualtar seu saldo!
                2 - Fazer uma tranferencia!
                3 - Realizar um deposito!
                4 - Pagar boleto!
                5 - Sair 
              
                """;

        Scanner leituraDados = new Scanner(System.in); //ler dados do teclado/digitado pelo usuario


        int opcao = 0;
        while (opcao != 5 ){
            System.out.println(menu);
            opcao = leituraDados.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo atual e : "+ saldoConta);

            } else if (opcao == 2) {
                System.out.println("Qual valor deseja Tranferir ?");
                 double valor = leituraDados.nextDouble();

                  if (valor > saldoConta){
                     System.out.println("Não há saldo suficiente para concluir a tresferencia !" + " Seu saldo atua e : " + saldoConta);
                  }else {
                     saldoConta -= valor;
                     System.out.println("Saldo em conta : "+ saldoConta );
                 }

            } else if (opcao == 3 ) {
                System.out.println("valor recebido : " );
                double valor = leituraDados.nextDouble();

                saldoConta += valor;
                System.out.println("Saldo em conta : "+ saldoConta );


            } else if (opcao == 4) {
                System.out.println("Qual o valor do Boleto ?");
                double valor = leituraDados.nextDouble();

                if (valor > saldoConta){
                    System.out.println("Não há saldo suficiente para concluir o pagamento !" + " Seu saldo atua e : " + saldoConta);
                }else {
                    saldoConta -= valor;
                    System.out.println("Saldo em conta : "+ saldoConta );

                }


            }else if (opcao != 5) {
                System.out.println("Opção digitada e invalida !");
            }else {
                System.out.println(opcao);

            }

        }
    }
}
