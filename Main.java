package Projeto_Animal;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Rex", "Cachorro");

        animal1.consultarAnimal();

        animal1.mudarNome("Thor");
        animal1.consultarAnimal();

        animal1.mudarNome("");
    }
}