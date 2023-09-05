import java.util.ArrayList;

class Curso {
    String nome;
    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}
