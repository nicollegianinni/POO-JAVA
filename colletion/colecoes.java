package colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class colecoes {

	public static void main(String[] args) {
		
		//forma de fazer com o INETEGER
		
		List<Integer> minhaLista = new ArrayList<Integer>(); // 1 letra da lista e dentro dela é maiscula
		
		minhaLista.add(3);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(4);
		minhaLista.add(5);
		
		
		for (Integer listaElementos: minhaLista) // for int / inteiro percorre o x da minha lista 
		{
			System.out.println(listaElementos);
		}
		System.out.println("\n removendo um elemneto da lista ");
		System.out.println();
		minhaLista.remove(0);
		
		for (Integer listaElementos: minhaLista) // for int / inteiro percorre o x da minha lista 
		{
			System.out.println(listaElementos);
		}
		int primeiroElemento = minhaLista.get(0);
		System.out.println("o primeiro elemento é : "+primeiroElemento);
		System.out.println();
		
		for (int i=0;i<minhaLista.size();i++) {
			System.out.println("\n Elemento: "+minhaLista.get(i));	
			
		}
		
		Collections.sort(minhaLista);
		System.out.println("\n  depois de ordenar ...");
		System.out.println(minhaLista);
		System.out.println();
		
		
		// outra forma de fazer SET
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(3);
		meuSet.add(5);
		meuSet.add(7);
		meuSet.add(6);
		meuSet.add(2);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while (iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
			
		}
		
		
	}

}
