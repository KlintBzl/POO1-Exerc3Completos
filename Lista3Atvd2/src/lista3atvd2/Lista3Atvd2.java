
package lista3atvd2;

public class Lista3Atvd2 {
    
    public static void main(String[] args) {
        Livro livro = new Livro("O Hobbit", "J.R.R. Tolkien");
        System.out.println("Livro: " + livro.getTitulo() + ", Disponível: " + livro.isDisponivel());
        livro.emprestar();
        System.out.println("Após empréstimo: " + livro.isDisponivel());
        livro.devolver();
        System.out.println("Após devolução: " + livro.isDisponivel());
    }
}

