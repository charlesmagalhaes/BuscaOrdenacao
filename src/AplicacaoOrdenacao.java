
public class AplicacaoOrdenacao {

	public static void main(String[] args) {
		BuscaOrdenacao ordenacao = new BuscaOrdenacao();
		
		int[] listaGerada = ordenacao.gerarArrayRandom(1, 10000, 500);
		
		BuscaOrdenacao.imprimirArray(listaGerada, "Lista Gerada: ");
		
		ordenacao.insertionSort(listaGerada);
		
		
		BuscaOrdenacao.imprimirArray(listaGerada, "Lista Organizada insertion sort: ");
		
		int numeroSorteado = (int) Math.floor(Math.random() * 10000); 
	
		System.out.println("Numero sorteado: "+numeroSorteado);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		
		/*
		 * Inicio - Medindo o tempo gasto busca binária
		*/
		long tempoInicial1 = System.nanoTime();
		BuscaOrdenacao.buscaBinaria(numeroSorteado, listaGerada);
		long tempoFinal1 = System.nanoTime();
		long tempoDecorrido = tempoFinal1 - tempoInicial1;
		System.out.printf("Tempo de processamento por busca binária: %.7f milliseconds%n", tempoDecorrido / 100000d);
		/*
		 * Fim - Medindo o tempo gasto busca binária
		*/
		
		/*
		 * Inicio - Medindo o tempo gasto busca sequencial
		*/
		tempoInicial1 = System.nanoTime();
		BuscaOrdenacao.buscaSequencial(numeroSorteado, listaGerada);
		tempoFinal1 = System.nanoTime();
		tempoDecorrido = tempoFinal1 - tempoInicial1;
		System.out.printf("Tempo de processamento por busca sequencial: %.7f milliseconds%n", tempoDecorrido / 100000d);
		/*
		 * Fim - Medindo o tempo gasto busca sequencial
		*/
		
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		if(BuscaOrdenacao.buscaBinaria(numeroSorteado, listaGerada) >= 0)
			System.out.println("Elemento foi encontrado(busca ordenacão). Posição: "+BuscaOrdenacao.buscaBinaria(numeroSorteado, listaGerada));
		else System.out.println("Elemento não encontrado com o valor de busca(busca binária).");
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		if(BuscaOrdenacao.buscaSequencial(numeroSorteado, listaGerada) > 0)
			System.out.print("Encontrado(s) "+BuscaOrdenacao.buscaSequencial(numeroSorteado, listaGerada)+" elemento(s) iguai(s)(busca por sequencial).");
		else System.out.println("Elemento não encontrado com o valor de busca(busca sequencial).");

	}

}
