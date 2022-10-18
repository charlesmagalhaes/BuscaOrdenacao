import java.util.Random;

public class BuscaOrdenacao {
	
	Random gerador = new Random();
	
	/**
     * Cria um array com numeros aleatórios
     */
	public int[] gerarArrayRandom(int faixaInicial, int faixaFinal, int qtsElementos) {
		int[] listaMerge = new int[qtsElementos];

		for (int i = 0; i < listaMerge.length; i++) {
			listaMerge[i] = gerador.nextInt(faixaInicial, faixaFinal);
		}
		return listaMerge;
	}
	
	
	public static void imprimirArray(int[] lista, String tituloLista) {
		 System.out.print(tituloLista);
	        for (int i = 0; i < lista.length; ++i)
	            System.out.print(lista[i] + " ");
	  
	        System.out.println();
		
	}
	
	public void insertionSort(int[] lista) {
		int key;
		int i;
		for(int j=1; j< lista.length;j++) {
			key = lista[j];
			i = j -1;
			
			while (i >= 0  && lista[i] > key) {
				lista[i+1] = lista[i];
				i = i -1;
			}
			lista[i+1] = key;
		}
		
	}
	
	
	public static int buscaBinaria(int buscarValor, int[] lista){
				
		int inicio = 0;
		int fim = lista.length-1;
		int meio;
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (buscarValor == lista[meio])
				return meio;
			if (buscarValor < lista[meio])
				fim = meio - 1;
			else
				inicio = meio + 1;
		}
		return -1;
	}
	
	public static int buscaSequencial(int buscarValor, int[] lista) {
		int contaElementos=0;
		for(int i=0; i< lista.length;i++) {
			if(lista[i] == buscarValor)
				contaElementos++;
		}
		return contaElementos;
		
	}

}
