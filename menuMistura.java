package ProjetoJava;

import java.util.Scanner;

public class menuMistura extends Menu{
	public menuMistura(String tipoMenu) {
		super(tipoMenu);
	}

	@Override
	public void aspectoComida() {
		int pessimo=0, ruim=0, razoavel=0, bom=0, excelente=0; 
		int numero;
		do {
			System.out.println("****Avalie o menu abaixo de acordo com a sua opinião****");
			System.out.println("Sobre o aspecto visual da mistura (carne; frango; soja) servida na escola: Que nota você daria?" );
			System.out.println("1. Péssimo" + "\n2. Ruim" + "\n3. Razoável " 
					+ "\n4. Bom"+"\n5. Excelente");
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite a opção escolhida: ");
			 numero = leia.nextInt();
		switch (numero) 
			{
			case 1:
				pessimo++; //10% 100 = 100 * 0,1
				break;
			case 2: 
				ruim++;
				break;
			case 3:
				razoavel++;
				break;
			case 4:
				bom++;
				break;
			case 5: 
				excelente++;
				break;
			default: 
				if (numero<1 || numero>5)
				{
					System.out.println("\nATENÇÃO: Opção inválida. Escolha um número de 1 a 5.");
				}
				break;
					} 
				}while (numero<1 || numero>5);
		
	}

	@Override
	public void frequenciaComida() {
		int sim=0, nao=0;
		int numero; 
			do {		
				System.out.println("A mistura vem sendo servida com frequência?");
				System.out.println("1. Sim" + "\n2. Não");
				Scanner leia = new Scanner(System.in);
				System.out.println("Digite a opção escolhida: ");
				 numero = leia.nextInt();
			switch (numero) 
				{
				case 1:
					sim++; //10% 100 = 100 * 0,1
					break;
				case 2: 
					nao++;
					break;
				default: 
					if (numero<1 || numero>2)
					{
						System.out.println("\nATENÇÃO: Opção inválida. Escolha a opção 1 (um) ou 2 (dois).");
					}
					break;
						} 
					}while (numero<1 || numero>2);
		
	}

	@Override
	public void comerTudo() {
		int sim=0, nao=0;
		int numero; 
			do {		
				System.out.println("Você costuma comer toda a mistura? ");
				System.out.println("1. Sim" + "\n2. Não");
				Scanner leia = new Scanner(System.in);
				System.out.println("Digite a opção escolhida: ");
				 numero = leia.nextInt();
			switch (numero) 
				{
				case 1:
					sim++; //10% 100 = 100 * 0,1
					break;
				case 2: 
					nao++;
					break;
				default: 
					if (numero<1 || numero>2)
					{
						System.out.println("\nATENÇÃO: Opção inválida. Escolha a opção 1 (um) ou 2 (dois).");
					}
					break;
						} 
					}while (numero<1 || numero>2);
		
	}
}
