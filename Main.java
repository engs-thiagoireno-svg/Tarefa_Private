public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setAno(1899);

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano: " + livro1.getAno());

    }
}