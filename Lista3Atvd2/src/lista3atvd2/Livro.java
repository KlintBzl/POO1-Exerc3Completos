
package lista3atvd2;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponivel = true;
    }
}


