
package lista3atvd4;

public class Lista3Atvd4 {
    
    public static void main(String[] args) {
        Filme pjt1 = new Filme("Jurassic World: Rebirth", "2 de julho de 2025", 1500000, 165);
        pjt1.calcularPrazo();
        pjt1.exibir();
        
        Musica pjt2 = new Musica("Breakin Dishes", "19 de janeiro de 2009", 5000, 250);
        pjt2.calcularPrazo();
        pjt2.exibir();
    }
}
