import java.util.ArrayList;

class Turma {
    Professor professor;
    Disciplina disciplina;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void realizarEnsalamento() {
        System.out.println("Turma de " + disciplina.nome + " com o professor/a " + professor.nome);
        System.out.println("Alunos matriculados:");

        for (Aluno aluno : alunos) {
            System.out.println(aluno.nome + " - " + aluno.curso);
        }

        System.out.println();
    }
}