package logicOperators;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		//Operadores aritméticos (+ - * / %)
		int num1 = 26;
		int num2 = 8;
		
		int resultado = num1 % num2;
		System.out.println(resultado); //2
		
		
		
		//Operadores lógicos (AND &&, OR ||, NOT !)
		int numUno = 5;
		int numDos = 6;
		
		boolean comparacionUno = numUno == numDos;
		System.out.println(comparacionUno);//false
		
		boolean comparacionDos = (numUno < numDos) && (numDos == numUno);
		System.out.println(comparacionDos); //false
		
		
		//Operadores relacionales (=, +=, -=, *=, /=, <, >, <=, >=)
		/*Relacionales
		= asignación
		+= asignación suma
		-= asignación resta
		*= asignación multiplicación
		/= asignación división
		== igual que
		!= distinto que
		< menor que
		> mayor que
		<= menor igual que
		>= mayor igual que
		
		=== La triple igualdad NO EXISTE en JAVA
		 */
		
		System.out.println(num1 >= num2);//true
		
		 
		
		
	}

}
