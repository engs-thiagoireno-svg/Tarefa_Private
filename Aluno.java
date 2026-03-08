package Projeto_Aluno;

public class Aluno {

    private String nome;
    private double nota;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota = 0;
    }

    public void adicionarNota(double valor) {
        if (valor > 0 && nota + valor <= 10) {
            nota += valor;
            System.out.println("Nota adicionada.");
        } else {
            System.out.println("Valor inválido. A nota deve ser positiva e não pode passar de 10.");
        }
    }

    public void retirarNota(double valor) {
        if (valor > 0 && nota >= valor) {
            nota -= valor;
            System.out.println("Nota retirada.");
        } else {
            System.out.println("Não há nota suficiente para retirar.");
        }
    }

    public double consultarNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }
}