
package lista3atvd3;

public class Bola extends Equipamento{
    private String material;
    private int durabilidade = 20;

    public Bola(String nome, double precoAluguel, String material) {
        super(nome, precoAluguel);
        this.material = material;
    }

    @Override
    public int definirDurabilidade(int durabilidade) {
        if(durabilidade <= this.durabilidade){
            this.durabilidade = durabilidade;
        System.out.println("Durabilidade da Bola: " + this.durabilidade + " horas");
        }
        return this.durabilidade;
    }

    
    
}
