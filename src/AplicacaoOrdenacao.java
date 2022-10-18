
public class AplicacaoOrdenacao {

	public static void main(String[] args) {
		BuscaOrdenacao ord = new BuscaOrdenacao();
		
		int[] listaGerada = ord.gerarArrayRandom(1, 10000, 500);
		
		ord.imprimirArray(listaGerada, "Lista Geradada: ");
		
		ord.insertionSort(listaGerada);
		
		
		ord.imprimirArray(listaGerada, "Lista Geradada insertion sort: ");

	}

}
