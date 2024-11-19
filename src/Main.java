public class Main {
    public static void main(String[] args) {

        Quest2 configuracoes = Quest2.getInstancia();

        System.out.println("Nome: " + configuracoes.getDados());
        System.out.println("Máximo Aparelhos: " + configuracoes.getTotalAparelhos());

        configuracoes.setProva("Teste Atividade 2");
        configuracoes.setTotalAparelhos(2);

        Quest2 ConfigAparelho = Quest2.getInstancia();
        System.out.println("Nome Att: " + ConfigAparelho.getDados());
        System.out.println("Máximo Aparelhos Att: " + ConfigAparelho.getTotalAparelhos());
    }
}
