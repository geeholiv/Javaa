/*
Exercício 12 e 14
*/
public class objetoPessoa {
    public static void main(String[] args) throws Exception{

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome= "Ana";
        pessoa1.idade = 16;
        pessoa1.mensagem = "Eu sou a Ana, gosto muito de ler e conversar com meus amigos.";

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

        System.out.println("\nTestando method mostrar dados: \n");

        pessoa1.mostrarDados();
        pessoa1.mostrarmensagem();

    }
}
