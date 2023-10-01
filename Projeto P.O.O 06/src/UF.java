class UF {
    private String nome;
    private String sigla;
    private String capital;
    private String coordenadasGeograficas;
    private int populacao;
    private double area;
    private double densidade;
    private String[] tresMaioresCidades;

    public UF(String nome, String sigla, String capital, String coordenadasGeograficas,
              int populacao, double area, String[] tresMaioresCidades) {
        this.nome = nome;
        this.sigla = sigla;
        this.capital = capital;
        this.coordenadasGeograficas = coordenadasGeograficas;
        this.populacao = populacao;
        this.area = area;
        this.densidade = populacao / area;
        this.tresMaioresCidades = tresMaioresCidades;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\nSigla: ").append(sigla).append("\nCapital: ").append(capital)
                .append("\nCoordenadas Geográficas: ").append(coordenadasGeograficas).append("\nPopulação: ")
                .append(populacao).append("\nÁrea: ").append(area).append("\nDensidade: ").append(densidade)
                .append("\nTrês Maiores Cidades: ");
        for (String cidade : tresMaioresCidades) {
            sb.append(cidade).append(", ");
        }
        return sb.toString();
    }
}