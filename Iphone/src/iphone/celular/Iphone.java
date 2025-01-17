package iphone.celular;

import java.util.Scanner;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.musicPlayer.MusicPlayer;
import iphone.navegadorInternet.NavegadorInternet;

public class Iphone implements AparelhoTelefonico, MusicPlayer, NavegadorInternet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		Iphone iphone = new Iphone();
		int option = 0;

        while (true) {
            System.out.println("1. Music Player");
            System.out.println("2. Telefone");
            System.out.println("3. Navegador de Internet");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            if (sc.hasNextInt()) {
                option = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.nextLine();
                continue;
            }
            
            switch (option) {
                case 1:
                    System.out.println("Music Player");
                    System.out.println();
                    iphone.tocarMusica();
                    System.out.println("Deseja pausar a música? (S/N)");
                    String resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
						iphone.pausarMusica();
                    }
                    System.out.println("Deseja escolher uma música? (S/N)");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
                    	System.out.println("Digite a música que quer reproduzir");
                    	String novaMusica = sc.nextLine();
						iphone.escolherMusica(novaMusica);
					}
                    break;
                case 2:
                    System.out.println("Telefone");
                    System.out.println();
                    System.out.println("Iniciar uma nova chamada? (S/N)");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
						System.out.println("Digite o contato: ");
						String contato = sc.next();
						System.out.println("Contato digitado: " + contato);
						iphone.ligar(contato);
					}
                    System.out.println("Você está recebendo uma ligação, deseja atender?");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
                    	iphone.atenderLigacao();
                    	}
                    else {
                    	System.out.println("Ligação recusada");
                    }
                    System.out.println("Deseja ouvir o correio de voz? (S/N)");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
						iphone.iniciarCorreioVoz();
					}
                    break;
                case 3:
                    System.out.println("Navegador de Internet");
                    iphone.exibirPagina();
                    System.out.println("Deseja abrir uma nova página? (S/N)");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
						iphone.adicionarNovaAba();
					}
                    System.out.println("Deseja atualizar a página? (S/N)");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
						iphone.atualizarPagina();
					}
                    break;
                case 4:
                    System.out.println("Desligando o Iphone");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
           if (option == 4) {
               break;
           }
        }
        sc.close();
		
	}

	
	public void exibirPagina() {
		System.out.println("Exibindo página");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		System.out.println("...");
		System.out.println("Nova página adicionada");
		exibirPagina();
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");
		System.out.println("...");
		System.out.println("Página atualizada");
		exibirPagina();
	}

	public void tocarMusica() {
		System.out.println("Tocando música");
	}

	public void pausarMusica() {
		System.out.println("Música pausada");
	}

	public void escolherMusica(String musicaEscolhida) {
		System.out.println("Tocando a música: " + musicaEscolhida);
	}
	public void ligar(String contato) {
		System.out.println("Ligando para o contato: " + contato);
	}

	public void atenderLigacao() {
		System.out.println("Atendendo ligação");
		System.out.println("Chamada em andamento");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Tocando correio de voz");
	}


}
