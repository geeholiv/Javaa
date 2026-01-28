/*
exercício 11 e 13
*/
public class Pessoa {
String nome;
int idade;
String mensagem;

public String getNome(){
return nome;
}
public void setNome(String nome){
    this.nome=nome;
}
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getMensagem(){
        return mensagem;
    }
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public void mostrarDados(){
    System.out.print("Nome: "+this.nome);
    System.out.print("Idade: "+this.idade);
    }

    public void mostrarmensagem(){
    System.out.print("Mensagem: "+this.mensagem);
    }

}


