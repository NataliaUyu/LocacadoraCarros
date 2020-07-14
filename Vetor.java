package exec7;
/**
 * Exercicio começando vetor
 * @author natalia
 * @since 13/02/2020
 * @version 0.1
 * */
public class Vetor {

	public static void main(String[] args) {
	
		
	  int quantidade[] ;
	  quantidade = new int[4];
	  quantidade[0]=10;
	  quantidade[3]= 4;
	  
	  System.out.println("Valor do vetor:" + quantidade);
	  

	  //for(int i = 0; i <=4; i++) {
	  // pegar vetor quantidade e o metodo lenght para varrer o vetor ate o final 
	  for(int i = 0; i < quantidade.length; i++) {
	System.out.println("valor do vetor" + quantidade[i]);
}
	}

}
