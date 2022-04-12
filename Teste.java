package ProjetoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
			
			CadAluno cadAluno = new CadAluno("");
			cadAluno.nome("");
			cadAluno.cpf("");
			
			
			menuFruta frutas = new menuFruta("");
			menuAcompanhamento acompanhamento = new menuAcompanhamento("");
			menuLegumes legumes = new menuLegumes("");
			menuMistura mistura = new menuMistura("");

			
			acompanhamento.aspectoComida();
			acompanhamento.frequenciaComida();
			acompanhamento.comerTudo();
			
			legumes.aspectoComida();
			legumes.frequenciaComida();
			legumes.comerTudo();
			
			mistura.aspectoComida();
			mistura.frequenciaComida();
			mistura.comerTudo();
			
			frutas.aspectoComida();
			frutas.frequenciaComida();
			frutas.comerTudo();
			
			System.out.println("\nCaro alune, gostar�amos de saber a sua opini�o sobre as op��es de frutas;");
			
			List<String> minhaLista = new ArrayList<String>();
			
			minhaLista.add("uva");
			minhaLista.add("banana");
			minhaLista.add("acerola");
			minhaLista.add("manga");
			minhaLista.add("abacaxi");
			
			System.out.println("\nQuais dessas frutas voc� sugere retirar card�pio?");
			System.out.println("Op��es dispon�veis:");
			
			for(String listaFrutas:minhaLista)
			{
				System.out.println(listaFrutas);
			}
			
			int op=0;
			
			do {
			Scanner leia = new Scanner(System.in);
			System.out.println("\nDigite o c�digo correspondente para remover: \n1- uva; \n2- banana; \n3- acerola; \n4- manga; \n5- abacaxi.");
			
			op = leia.nextInt();
			
			switch (op)
			{
			case 1:
				
				minhaLista.remove(0);
			break;
			case 2:
				minhaLista.remove(1);
			break;
			case 3:
				minhaLista.remove(2);
			break;
			case 4:
				minhaLista.remove(3);
			break;
			case 5:
				minhaLista.remove(4);
			break;
			default: 
				if (op<1 || op>5)
				{
					System.out.println("\nATEN��O: Op��o inv�lida. Escolha um n�mero de 1 a 5.");
				}
			break;
					} 
				}while (op<1 || op>5);
			
			System.out.println("\nOp��es atualizadas:");
			
			for(String listaFrutas:minhaLista)
			{
				System.out.println(listaFrutas);
			}
		}
	}
