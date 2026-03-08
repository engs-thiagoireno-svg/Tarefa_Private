package Projeto_Animal;

public class Animal {
    
    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void consultarAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
    }

    public void mudarNome(String novoNome) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            nome = novoNome;
            System.out.println("Nome alterado com sucesso.");
        } else {
            System.out.println("Nome inválido. Não pode ser vazio.");
        }
    }
}