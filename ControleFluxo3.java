//FLUXO CONDICIONAL
//Utilização do IF, ELSE IF, ELSE
	
public class ControleFluxo{
	/*Método principal da classe*/
	public static void main (String [] args){
		int idade = 7;
		if (idade <=7){ //a idade é menor ou igual a 7
			System.out.println("Ainda é uma criança";)
		}else if (idade > 7 && idade <=18) //a idade é maior que 7 e menor ou igual a 18
		System.out.println("É um adolescente");
	}else if (idade > 18 && idade <= 60) //a idade é maior que 18 e menor ou igual que 60
	System.out.println("É um adulto");
}else {
	System.out.println("Está na melhor idade");
}
	
}//fim do método
}//fim do método
}//fim da classe

/**
podemos usar o else if, até que alguma das condições esteja satisfeita no código.
**/