
package lista3atvd3;

public class Bicicleta extends Equipamento{
    private String tipo;
    private int durabilidade = 50;

    public Bicicleta(String nome, double precoAluguel, String tipo) {
        super(nome, precoAluguel);
        this.tipo = tipo;
    }

    @Override
    public int definirDurabilidade(int durabilidade) {
        if(durabilidade <= this.durabilidade){
            this.durabilidade = durabilidade;
        System.out.println("Durabilidade da Bike: " + this.durabilidade + " horas");
        }
        return this.durabilidade;
    }
    
}
