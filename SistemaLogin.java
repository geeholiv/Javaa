/*
Ex08- Desenvolva um programa em Java que simule um sistema de login simples para uma conta corrente. 
*/

import java.util.Scanner;
public class SistemaLogin {

public static void main(String[] args) {
final String USUARIO_CORRETO = "usuario123";
final String SENHA_CORRETA = "senha@123";

Scanner scanner = new Scanner(System.in);

String nomeUsuario, senha;
int tentativas = 0;
boolean loginBemSucedido = false;

while (tentativas < 3) {
System.out.print("Digite o nome de usuário: ");
nomeUsuario = scanner.nextLine();
System.out.print("Digite a senha: ");
senha = scanner.nextLine();

if (nomeUsuario.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
System.out.println("Login bem-sucedido! Bem-vindo à sua conta corrente.");
loginBemSucedido = true;
break;
} else {
 
tentativas++;
System.out.println("Nome de usuário ou senha incorretos.");
System.out.println("Tentativas restantes: " + (3 - tentativas));
}
     }

if (!loginBemSucedido && tentativas == 3) {
 System.out.println("Você excedeu o número máximo de tentativas. Acesso bloqueado.");
    }


scanner.close();
    }
}