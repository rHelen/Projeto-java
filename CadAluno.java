package ProjetoJava;

import java.util.Scanner;

public class CadAluno implements Cadastro {

	private String tipoCadastro;

	public CadAluno(String tipoCadastro) {
		super();
		this.tipoCadastro = tipoCadastro;
	}

	@Override
	public void nome(String nome) {
		System.out.println("\nInsira o seu nome: ");
		Scanner leia = new Scanner(System.in);
		nome = leia.nextLine();
		//System.out.println("\nNome do alune: "+nome);
	}


	@Override
	public void cpf(String cpf) {
		System.out.println("\nInsira o seu CPF: ");
		Scanner leia = new Scanner(System.in);
		cpf = leia.nextLine();
		//System.out.println("\nCPF do alune: "+cpf);
		
	}
}
