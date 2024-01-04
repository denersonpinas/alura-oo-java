public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Gigante de Aço";
        meuFilme.anoDeLancamento = 2010;
        meuFilme.duracaoEmMinutos = 60;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8.5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);

        System.out.println(meuFilme.pegaMedia());
    }
}
