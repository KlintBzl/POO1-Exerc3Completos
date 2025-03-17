
package lista3atvd4;

public class Filme extends Projeto{
    private int duracaoMinutos;

    public Filme(String titulo, String dataInicio, double orcamento, int duracaoMinutos) {
        super(titulo, dataInicio, orcamento);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public int calcularPrazo() {
        return duracaoMinutos / 10;
    }
    
    public void exibir(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Data de Inicio: " + getDataInicio());
        System.out.println("Orçamento: " + getOrcamento());
        System.out.println("Prazo: " + calcularPrazo());
        System.out.println("");
    }
    
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    
    
}
