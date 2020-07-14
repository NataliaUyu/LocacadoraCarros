package exec7;

import javax.swing.JOptionPane;
/**
 * Programa responsavel por pesquisar carros, por modelo, cor, combustivel.
 * com opção do usario ver todos os carros ou comprar um carro
 * caso ele compre o carro ele deve informar o modelo e cor
 * usuario deve informar o valor que vai pagar
 * @author natalia
 * @since 14/02/2020
 * @version 3.0
 */
public class Locadora {
	boolean exit = false;
	static Carro vetorCarro[];

	public static void main(String[] args) {

		vetorCarro = new Carro[20];

		Carro carro1 = new Carro("FORD", "ABC-1234", 100, "ALCOOL", 50000, "AMARELO", false);

		Carro carro2 = new Carro("FORD", "XLY-1430", 200, "DIESEL", 100000, "AMARELO", false);

		Carro carro3 = new Carro("TOYOTA", "ATR-9999", 150, "GASOLINA", 80000, "VERDE", false);

		Carro carro4 = new Carro("VOLKSWAGEN", "ABC-123", 120, "ALCOOL", 45000, "VERMELHO", false);

		Carro carro5 = new Carro("NISSAN", "gchc-123", 111, "DIESEL", 10000, "MARROM", false);

		Carro carro6 = new Carro("HYUNDAI", "ABgC-123", 125, "ALCOOL", 70000, "PRETO", false);

		Carro carro7 = new Carro("CHEVROLET", "AcBC-123", 147, "GASOLINA", 90000, "BRANCO", false);

		Carro carro8 = new Carro("RENAULT", "AukBC-123", 185, "DIESEL", 30000, "ROSA", false);

		Carro carro9 = new Carro("MERCEDES BENZ", "ABCg-123", 99, "ALCOOL", 34000, "CINZA", false);

		Carro carro10 = new Carro("BMW", "AuBC-123", 100, "DIESEL", 67000, "ROXO", false);

		vetorCarro[0] = carro1;

		vetorCarro[1] = carro2;

		vetorCarro[2] = carro3;

		vetorCarro[3] = carro4;

		vetorCarro[4] = carro5;

		vetorCarro[5] = carro6;

		vetorCarro[6] = carro7;

		vetorCarro[7] = carro8;

		vetorCarro[8] = carro9;

		vetorCarro[9] = carro10;

		Carro carroNovo = new Carro("", "", 0, "", -1, "", true);
		
		for (int i=10; i<vetorCarro.length; i++) {
			vetorCarro[i] = carroNovo;
		}
		
		new Locadora();

	}

	// --------------------------------------------------------------------------------------------------------------
	
	public Locadora() {

		while(!exit) {
			escolha();
		}
	}

	public void escolha() {
try {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(
	
				"1 para modelo\n2 para combustivel\n3 velocidade\n4 cor\n5 todos os carros\n6 comprar\n7 adicionar\n8 sair"));

		switch (escolha) {

		case 1:

			buscarModelo();

			break;

		case 2:

			buscarCombustivel();

			break;

		case 3:

			buscarVelocidade();

			break;

		case 4:

			buscarCor();

			break;

		case 5:

			ordenar();

			break;

		case 6:

			escolherCarro();

			break;
		case 7:
			adicionarCarro();
			break;
		case 8:
			exit = true;
			break;
		default:

			JOptionPane.showMessageDialog(null, "essa opção não existe");

		} 
} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"OPÇAO INVALIDA");
			escolha();
		}

	}
	

	public void buscarModelo() {

		boolean encontrou = false;

		String buscarModelo = JOptionPane.showInputDialog("Digite o modelo").toUpperCase();
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {

				if (vetorCarro[i].modeloDoCarro.equals(buscarModelo)) {

					message = message + "\n O modelo é: " + vetorCarro[i].modeloDoCarro + "\n A placa do carro é: "
							+ vetorCarro[i].placaDoCarro + "\n A velocidade é: " + vetorCarro[i].velocidadeMaxima
							+ "\n O combustivel é: " + vetorCarro[i].combustivel + "\n O valor é: "
							+ vetorCarro[i].valor + "\n A cor é: " + vetorCarro[i].cor + "\n";
					// System.out.println(vetorCarro[i]);

					/*
					 * System.out.println("o modelo é " + vetorCarro[i].modeloDoCarro);
					 * 
					 * System.out.println("a placa do carro é " + vetorCarro[i].placaDoCarro);
					 * 
					 * System.out.println("a velocidade é " + vetorCarro[i].velocidadeMaxima);
					 * 
					 * System.out.println("o combustivel é " + vetorCarro[i].combustivel);
					 * 
					 * System.out.println("o valor é " + vetorCarro[i].valor);
					 * 
					 * System.out.println("a cor é " + vetorCarro[i].cor);
					 * 
					 * System.out.println("\n");
					 * 
					 */
					encontrou = true;

				}
			}

		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}

	}

	public void buscarCombustivel() {
		boolean encontrou = false;

		String buscarCombustivel = JOptionPane.showInputDialog("Digite o combustivel").toUpperCase();
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].vendido == false) {

				if (vetorCarro[i].combustivel.equals(buscarCombustivel)) {

					message = message + "\n O modelo é: " + vetorCarro[i].modeloDoCarro + "\n A placa do carro é: "
							+ vetorCarro[i].placaDoCarro + "\n A velocidade é: " + vetorCarro[i].velocidadeMaxima
							+ "\n O combustivel é: " + vetorCarro[i].combustivel + "\n O valor é: "
							+ vetorCarro[i].valor + "\n A cor é: " + vetorCarro[i].cor + "\n";
					// System.out.println(vetorCarro[i]);

					/*
					 * System.out.println("o modelo é " + vetorCarro[i].modeloDoCarro);
					 * 
					 * System.out.println("a placa do carro é " + vetorCarro[i].placaDoCarro);
					 * 
					 * System.out.println("a velocidade é " + vetorCarro[i].velocidadeMaxima);
					 * 
					 * System.out.println("o combustivel é " + vetorCarro[i].combustivel);
					 * 
					 * System.out.println("o valor é " + vetorCarro[i].valor);
					 * 
					 * System.out.println("a cor é " + vetorCarro[i].cor);
					 * 
					 * System.out.println("\n");
					 */encontrou = true;
				}
			}

		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}

	}

	public void buscarVelocidade() {
		boolean encontrou = false;

		int buscarVelocidade = (Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade").toUpperCase()));
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {
				if (vetorCarro[i].velocidadeMaxima == (buscarVelocidade)) {

					message = message + "\n O modelo é: " + vetorCarro[i].modeloDoCarro + "\n A placa do carro é: "
							+ vetorCarro[i].placaDoCarro + "\n A velocidade é: " + vetorCarro[i].velocidadeMaxima
							+ "\n O combustivel é: " + vetorCarro[i].combustivel + "\n O valor é: "
							+ vetorCarro[i].valor + "\n A cor é: " + vetorCarro[i].cor + "\n";

				  encontrou = true;
				}
			}

		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}

	}

	public void buscarCor() {
		boolean encontrou = false;

		String buscarCor = JOptionPane.showInputDialog("Digite a cor").toUpperCase();
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {
				if (vetorCarro[i].cor.equals(buscarCor)) {

					message = message + "\n O modelo é: " + vetorCarro[i].modeloDoCarro + "\n A placa do carro é: "
							+ vetorCarro[i].placaDoCarro + "\n A velocidade é: " + vetorCarro[i].velocidadeMaxima
							+ "\n O combustivel é: " + vetorCarro[i].combustivel + "\n O valor é: "
							+ vetorCarro[i].valor + "\n A cor é: " + vetorCarro[i].cor + "\n";
					encontrou = true;
				}
			}

		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

	public void ordenar() {

		Carro aux;

		boolean controle;

		for (int i = 0; i < vetorCarro.length; i++) {

			controle = true;

			for (int j = 0; j < (vetorCarro.length - 1); j++) {
				if (vetorCarro[j].valor < vetorCarro[j + 1].valor) {
					aux = vetorCarro[j];
					vetorCarro[j] = vetorCarro[j + 1];
					vetorCarro[j + 1] = aux;
					controle = false;
				}
			}

			if (controle) {
				break;
			}
		}

		String msg = "";
		for (int k = 0; k < vetorCarro.length; k++) {
			if (!vetorCarro[k].vendido) {
				msg = msg + "\n O modelo é: " + vetorCarro[k].modeloDoCarro + "\n A placa do carro é: "
						+ vetorCarro[k].placaDoCarro + "\n A velocidade é: " + vetorCarro[k].velocidadeMaxima
						+ "\n O combustivel é: " + vetorCarro[k].combustivel + "\n O valor é: " + vetorCarro[k].valor
						+ "\n A cor é: " + vetorCarro[k].cor + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, msg);
	}

	public void ordenarCrescente() {
		Carro aux;
		boolean controle;
		for (int i = 0; i < vetorCarro.length; i++) {
			controle = true;
			for (int j = 0; j < (vetorCarro.length - 1); j++) {
				if (vetorCarro[j].valor > vetorCarro[j + 1].valor) {
					aux = vetorCarro[j];
					vetorCarro[j] = vetorCarro[j + 1];
					vetorCarro[j + 1] = aux;
					controle = false;
				}
			}
			if (controle) {
				break;
			}
		}
	}

	public void escolherCarro() {
		ordenarCrescente();
		boolean encontrou = false;
		String message = "";

		// pedir para o usuario informar modelo e cor

		String modelo2 = JOptionPane.showInputDialog("Digite o modelo do caro").toUpperCase();
		String cor2 = JOptionPane.showInputDialog("Digite a cor do carro").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {

			if ((vetorCarro[i].modeloDoCarro.equals(modelo2))
					&& (vetorCarro[i].cor.equals(cor2) && (vetorCarro[i].vendido == false))) {

				message = message + i + " \n O modelo é: " + vetorCarro[i].modeloDoCarro + "\n A placa do carro é: "
						+ vetorCarro[i].placaDoCarro + "\n A velocidade é: " + vetorCarro[i].velocidadeMaxima
						+ "\n O combustivel é: " + vetorCarro[i].combustivel + "\n O valor é: " + vetorCarro[i].valor
						+ "\n A cor é: " + vetorCarro[i].cor + "\n";

				encontrou = true;

			}

		}

		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado");
		} else {
			JOptionPane.showMessageDialog(null, message);

			// Usuario deve digitar o carro que quer comprar
			int escolha1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do carro"));
			

			// Programa calcula se o preço é igual ou maior que do carro
			if (escolha1 >19) {
				JOptionPane.showMessageDialog(null,"Numero do carro invalido!!!!");
			}else {
			// Usuario informa o dinheiro que tem
			double preco = Double.parseDouble(JOptionPane.showInputDialog("digite o valor que você vai pagar"));
			double total = preco - vetorCarro[escolha1].valor;
			//JOptionPane.showMessageDialog(null, "Carro comprado com sucesso! Seu troco é \n" + total);
	

			if(preco > vetorCarro[escolha1].valor||preco == vetorCarro[escolha1].valor) {
				total = preco - vetorCarro[escolha1].valor;
				JOptionPane.showMessageDialog(null,"Carro comprado com sucesso, seu troco é: "+ total);
				vetorCarro[escolha1].vendido = true;
				ordenar();
			//if(preco == vetorCarro[escolha1].valor) {
				//JOptionPane.showMessageDialog(null, "Carro comprado com sucesso");	
				//vetorCarro[escolha1].vendido = true;
				//ordenar();
			}else  {
				JOptionPane.showMessageDialog(null,"Não foi possivel comprar o carro");
			}
			}
		}
		   
	}
	public void adicionarCarro(){
		try {
		
		String modeloNovo = JOptionPane.showInputDialog("Digite o modelo do novo caro").toUpperCase();
		String placaNova = JOptionPane.showInputDialog("Digite a placa do novo carro").toUpperCase();
		int velocidadeNova =Integer.parseInt( JOptionPane.showInputDialog("Digite a velocidade do novo carro").toUpperCase());
		String combustivelNovo = JOptionPane.showInputDialog("Digite o combustivel do novo carro").toUpperCase();
		double valorNovo =Double.parseDouble( JOptionPane.showInputDialog("Digite o valor do novo carro").toUpperCase());
		String corNovo = JOptionPane.showInputDialog("Digite a cor do novo carro").toUpperCase();
		boolean vendido = false;

		Carro car = new Carro(modeloNovo, placaNova, velocidadeNova, combustivelNovo, valorNovo, corNovo, vendido);
		boolean cadastreiCarro = false;
		
		for(int i = 10; i < vetorCarro.length ; i++) {
		if (vetorCarro[i].valor<=0) {
		    vetorCarro[i]= car;
		    cadastreiCarro = true;
		    break;
				}
			}
		
		if (cadastreiCarro) {
			JOptionPane.showMessageDialog(null, "cadastrado com sucesso");
		} else {
			 JOptionPane.showMessageDialog(null, "Não é mais possivel cadastrar");
		}		
		
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"OPÇAO INVALIDA");
			adicionarCarro();
		}
     }
}
	
	



