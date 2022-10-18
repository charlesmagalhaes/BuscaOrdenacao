
public class AplicacaoOrdenacao {

	public static void main(String[] args) {
		BuscaOrdenacao ordenacao = new BuscaOrdenacao();
		
		int[] listaGerada = ordenacao.gerarArrayRandom(1, 100, 20);
		
		BuscaOrdenacao.imprimirArray(listaGerada, "Lista Geradada: ");
		
		ordenacao.insertionSort(listaGerada);
		
		
		BuscaOrdenacao.imprimirArray(listaGerada, "Lista Organizada insertion sort: ");
		
		int numeroSorteado = (int) Math.floor(Math.random() * 100); 
	
		System.out.println("Numero sorteado: "+numeroSorteado);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		if(BuscaOrdenacao.buscaBinaria(numeroSorteado, listaGerada) >= 0)
			System.out.println("Elemento foi encontrado(busca ordenacão). Posição: "+BuscaOrdenacao.buscaBinaria(numeroSorteado, listaGerada));
		else System.out.println("Elemento não encontrado com o valor de busca(busca ordenacão).");
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		if(BuscaOrdenacao.buscaSequencial(numeroSorteado, listaGerada) >= 0)
			System.out.print("Elemento foi encontrado(busca sequencial). Posição: "+BuscaOrdenacao.buscaSequencial(numeroSorteado, listaGerada));
		else System.out.println("Elemento não encontrado com o valor de busca(busca sequencial).");


	}

}
