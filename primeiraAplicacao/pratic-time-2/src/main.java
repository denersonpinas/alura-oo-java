public class main {

    public static void main(String[] args) {
        double notaUm = 5.2;
        double notaDois = 8.5;
        double mediaNota = (notaUm + notaDois) / 2;
        System.out.println(mediaNota);

        int mediaNotaInt = (int) mediaNota;
        System.out.println(mediaNotaInt);

        char nota = 'A';
        String palavra = "Sua nota foi: ";
        String frase = palavra + nota;
        System.out.println(frase);

        double precoProduto = 5.5;
        int quantidade = 52;
        String mensagem = quantidade + " Uvas no valor de: R$" + precoProduto + ". É: R$" + (precoProduto * quantidade);
        System.out.println(mensagem);

        double valorEmDolares = 117;
        System.out.println("$" + valorEmDolares + " dólares convertido fica R$" + (valorEmDolares * 4.94));


        double preOriginal = 4550.99;
        double percentualDesconto = 70;
        double desconto =  (percentualDesconto / 100) * 4550.99;
        System.out.println("O PS5 no valor de R$" + preOriginal + " com desconto de " + percentualDesconto + "% fica R$" + desconto);
    }
}
