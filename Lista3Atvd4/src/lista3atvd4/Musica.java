
package lista3atvd4;

public class Musica extends Projeto{
    private int numeroNotas;

    public Musica(String titulo, String dataInicio, double orcamento, int numeroNotas) {
        super(titulo, dataInicio, orcamento);
        this.numeroNotas = numeroNotas;
    }

    @Override
    public int calcularPrazo() {
        return numeroNotas / 50;
    }
    
    public void exibir(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Data de Inicio: " + getDataInicio());
        System.out.println("Orçamento: " + getOrcamento());
        System.out.println("Prazo: " + calcularPrazo());
        System.out.println("");
    }

    public int getNumeroNotas() {
        return numeroNotas;
    }
    public void setNumeroNotas(int numeroNotas) {
        this.numeroNotas = numeroNotas;
    }
    
}
