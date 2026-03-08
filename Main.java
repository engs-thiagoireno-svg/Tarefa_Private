package Projeto_Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Carlos");

        aluno1.adicionarNota(7);
        System.out.println("Nota atual: " + aluno1.consultarNota());

        aluno1.adicionarNota(5);

        aluno1.retirarNota(3);
        System.out.println("Nota atual: " + aluno1.consultarNota());

        aluno1.retirarNota(10);
    }
}