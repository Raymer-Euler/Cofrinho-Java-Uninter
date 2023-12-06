package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu(){
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}

	public void exibirMenuPrincipal() {
		System.out.println("COFRINHO");
		System.out.println("Escolha algumas opcoes a baixo:");
		System.out.println("1-Adicionar moeda:");
		System.out.println("2-Remover moeda:");
		System.out.println("3-Listar moedas:");
		System.out.println("4-Calcular valor total convertido para real:");
		System.out.println("0-Encerrar:");
		
		String opcaoSelecionada = sc.next();
		
		switch (opcaoSelecionada) {
		case "0":
			System.out.println("Programa encerrado com sucesso!");
			break;
			
		case "1":
			System.out.println("Escolha o tipo de Moeda:");
			System.out.println("1 - Real:");
			System.out.println("2 - Dolar:");
			System.out.println("3 - Euro:");
		
			int opcaoMoeda = sc.nextInt();
		
			System.out.println("Digite um valor:");
			
			String valorTextualMoeda = sc.next();
		
			valorTextualMoeda = valorTextualMoeda.replace(",", ".");
			double valorMoeda = Double.valueOf(valorTextualMoeda);
		
			Moeda moeda = null;
		
			if(opcaoMoeda==1) {
				moeda = new Real(valorMoeda);
			}else if(opcaoMoeda==2) {
				moeda = new Dolar(valorMoeda);
			}else if(opcaoMoeda==3) {
				moeda = new Euro(valorMoeda);
			}else {
				System.out.println("Não existe essa moeda. Você sera direcionado para o menu principal!");
				exibirMenuPrincipal(); 
			}
		
			cofrinho.adicionar(moeda);
			System.out.println("Moeda adicionada!");
			exibirMenuPrincipal(); 
			break;
			
		case"2":
			System.out.println("Escolha o tipo de Moeda:");
			System.out.println("1 - Real:");
			System.out.println("2 - Dolar:");
			System.out.println("3 - Euro:");
		
			int oopcaoMoeda = sc.nextInt();
		
			System.out.println("Digite um valor:");
			
			String valoorTextualMoeda = sc.next();
		
			valoorTextualMoeda = valoorTextualMoeda.replace(",", ".");
			double valoorMoeda = Double.valueOf(valoorTextualMoeda);
		
			Moeda mooeda = null;
		
			if(oopcaoMoeda==1) {
				mooeda = new Real(valoorMoeda);
			}else if(oopcaoMoeda==2) {
				mooeda = new Dolar(valoorMoeda);
			}else if(oopcaoMoeda==3) {
				mooeda = new Euro(valoorMoeda);
			}else {
				System.out.println("Não existe essa moeda. Você sera direcionado para o menu principal!");
				exibirMenuPrincipal(); 
			}
		
			cofrinho.remover(mooeda);
			exibirMenuPrincipal(); 
			break;
			
		case"3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break;
			
		case"4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			String valortotalConvertidoTextual = String.format("%.2f",valorTotalConvertido);
			valortotalConvertidoTextual = valortotalConvertidoTextual.replace(".", ",");
			System.out.println("O valor total convertido para real ? " + valortotalConvertidoTextual);
			exibirMenuPrincipal();
			break;
			
		
		default:
			System.out.println("Opcao Invalida!");
			exibirMenuPrincipal();
			break;
			
		}
		
	}
	
	
		
}
