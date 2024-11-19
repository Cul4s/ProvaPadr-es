public class Quest2 {

    private static Quest2 uniqueInstance;
    private String prova2;
    private int totalAparelhos;

    private Quest2() {

        this.prova2 = "Teste Prova";
        this.totalAparelhos = 1;
    }

    public static Quest2 getInstancia() {
        if (uniqueInstance == null) {
            uniqueInstance = new Quest2();
        }
        return uniqueInstance;
    }
    public String getDados() {
        return prova2;
    }

    public void setProva(String prova) {
        this.prova2 = prova;
    }

    public int getTotalAparelhos() {
        return totalAparelhos;
    }

    public void setTotalAparelhos(int totalAparelhos) {
        this.totalAparelhos = totalAparelhos;
    }
}
