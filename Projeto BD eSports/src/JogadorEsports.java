class JogadorEsports {
    private String nome;
    private String funcao;
    private String time;
    private String patente;

    public JogadorEsports(String nome, String funcao, String time, String patente) {
        this.nome = nome;
        this.funcao = funcao;
        this.time = time;
        this.patente = patente;
    }

    // Getters para obter os dados do jogador
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getTime() {
        return time;
    }

    public String getPatente() {
        return patente;
    }
}