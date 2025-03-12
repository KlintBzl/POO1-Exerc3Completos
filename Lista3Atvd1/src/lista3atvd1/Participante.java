
package lista3atvd1;

public class Participante {
    private String nomeCompleto, email, dataInscricao;
    
    public Participante(String nome, String dataInscricao){
        nomeCompleto = nome;
        this.dataInscricao = dataInscricao;
        if(nomeCompleto == nome && this.dataInscricao == dataInscricao){
            System.out.println("Participante criado com sucesso");
        }
    }
    public Participante(String nome, String dataInscricao, String email){
        nomeCompleto = nome;
        this.dataInscricao = dataInscricao;
        if(email.contains("@")){
        this.email = email;
       }else{
            System.out.println("ERRO na criação do participante, razão: Email incorreto ou inválido");
        }
        if(nomeCompleto == nome && this.dataInscricao == dataInscricao && this.email == email){
            System.out.println("Participante criado com sucesso");
        }
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public String getEmail() {
        return email;
    }
    public String getDataInscricao() {
        return dataInscricao;
    }
    public void setEmail(String email) {
        if(email.contains("@")){
        this.email = email;
       }else{
            System.out.println("Insira um email válido");
        }
    }
    
  
}
