import java.util.Random;

public class BuscarOrdenacao {
	
	Random gerador = new Random();
	
	/**
     * Cria um array com numeros aleatórios
     */
	public int[] gerarArrayRandom(int Faixainicial, int Faixafinal, int qtsElementos) {
		int[] listaMerge = new int[qtsElementos];

		for (int i = 0; i < listaMerge.length; i++) {
			listaMerge[i] = gerador.nextInt(Faixainicial, Faixafinal);
		}
		return listaMerge;
	}
	
	
	public void imprimirArray(int[] lista, String tituloLista) {
		 System.out.print(tituloLista);
	        for (int i = 0; i < lista.length; ++i)
	            System.out.print(lista[i] + " ");
	  
	        System.out.println();
		
	}

}
