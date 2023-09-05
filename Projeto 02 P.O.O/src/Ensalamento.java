public class Ensalamento {
    public static void main(String[] args) {

        Professor mia = new Professor("Mia", "POO");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Professor paula = new Professor("Paula", "BI");


        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");


        Disciplina poo = new Disciplina("POO do curso de TI");
        Disciplina estruturaDeDados = new Disciplina("Estrutura de Dados do curso de TI");
        Disciplina bi = new Disciplina("BI do curso de ADM");


        ti.adicionarDisciplina(poo);
        ti.adicionarDisciplina(estruturaDeDados);
        adm.adicionarDisciplina(bi);


        Aluno alfredo = new Aluno("Alfredo", "TI");
        Aluno peterson = new Aluno("Peterson", "ADM");
        Aluno wendel = new Aluno("Wendel", "TI");
        Aluno ian = new Aluno("Ian", "ADM");
        Aluno debra = new Aluno("Debra", "TI");
        Aluno luana = new Aluno("Luana", "ADM");
        Aluno bruno = new Aluno("Bruno", "TI");
        Aluno romeu = new Aluno("Romeu", "ADM");
        Aluno julieta = new Aluno("Julieta", "TI");
        Aluno maria = new Aluno("Maria", "ADM");
        Aluno capitu = new Aluno("Capitú", "TI");
        Aluno bentinho = new Aluno("Bentinho", "ADM");
        Aluno amelia = new Aluno("Amélia", "TI");


        Turma turma1 = new Turma(mia, poo);
        Turma turma2 = new Turma(saulo, estruturaDeDados);
        Turma turma3 = new Turma(paula, bi);


        turma1.adicionarAluno(alfredo);
        turma1.adicionarAluno(capitu);
        turma1.adicionarAluno(amelia);
        turma1.adicionarAluno(julieta);
        turma1.adicionarAluno(bruno);
        turma1.adicionarAluno(wendel);
        turma1.adicionarAluno(debra);
        turma2.adicionarAluno(amelia);
        turma2.adicionarAluno(capitu);
        turma2.adicionarAluno(alfredo);
        turma2.adicionarAluno(wendel);
        turma2.adicionarAluno(debra);
        turma2.adicionarAluno(bruno);
        turma2.adicionarAluno(julieta);
        turma3.adicionarAluno(peterson);
        turma3.adicionarAluno(ian);
        turma3.adicionarAluno(luana);
        turma3.adicionarAluno(romeu);
        turma3.adicionarAluno(maria);
        turma3.adicionarAluno(bentinho);



        turma1.realizarEnsalamento();
        turma2.realizarEnsalamento();
        turma3.realizarEnsalamento();
    }
}
