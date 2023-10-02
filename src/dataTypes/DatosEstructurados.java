package dataTypes;

public class DatosEstructurados {
	
	public static void main (String[] args) {
		/*
		 * Datos Estructurados:
		 * Datos complejos que almacenan caracteres, cadenas de caracteres
			o cadenas de cadenas o algun tipo de dato primitivo
		 * 
		 * 		-Strings: cadena de caracteres, se declaran entre comillas
		 * 					en Java son considerados objetos.
		 * 		-Arrays: colección de datos del mismo tipo de cada elemento corresponde a un índice numérico 
		 */
		
		//Forma convencional de inicializar un String
		String myString = "Hola, soy un String.";
		System.out.println(myString);
		
		//String como objeto - otra forma de inicializar un String
		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);
		
		/*
		 * Métodos para strings:
		 * 			-String length: permite medir la longitud de u string
		 * 			-toUpperCase() y toLowerCase() : Conversión a mayúculas o minúsculas
		 * 			-indexOf(): Devuelve el índice de la primera aparición de un texto en específico
		 * 			-
		 */
		
		String textoString = "AleMendieta";
		// int tamañoTextoString = textoString.length(); //Se debe pasar a entero la variable ya que el tamaño es un número.
		System.out.println("La longitud de " + textoString + " es: " + textoString.length());
		
		String upperCaseString = textoString.toUpperCase();
		System.out.println(upperCaseString);//Mi texto se escribe todo en mayúsculas
		
		String lowerCaseString = textoString.toLowerCase();
		System.out.println(lowerCaseString);//Mi texto se imprime en minúsculas
		
		String fraseString = "Nadie sabe lo que tiene hasta que lo ve perdido";
		int indexOfFraseString = fraseString.indexOf("perdido");
		System.out.println("El índice donde inicia mi palabra perdido en la frase es: " + indexOfFraseString);
		
		//Concatenación
		String firstName = "Ale";
		String lastName = "Mendieta";
		String userName = firstName + " " + lastName; // Ale Mendieta
		System.out.println(userName);
		
		//Usando el método concat
		System.out.println(firstName.concat(lastName)); //AleMendieta
		
		//Métodos de conversión
		String presupuesto = "50000";
		int conversionPresupuesto = Integer.parseInt(presupuesto);
		System.out.println(((Object)conversionPresupuesto).getClass().getSimpleName());
		//mi dato de tipo entero lo transformo a objeto para poder manipularlo con métodos como a los Strings
		//con getClass obtengo la clase del API de Java y con getSimpleName obtengo el tipo de dato, en este caso es un Integer
		
		
		//Arreglos
		String[] autos = {"MiniCooper", "VMW", "Ferrari", "Audi"};
		System.out.println(autos[0]);//Impresión del elemento que está en la posición 0 de mi array autos
		
		//Variables dinámicas
		float gastosM = 35626.26f; //Mi variable inicia con este valor
		gastosM = 42626.26f; //Luego toma otro, ya que se le reasignó un nuevo valor
		
		//Variables constantes o finales
		final float GRAVEDAD = 9.8f; //Una constante de tipo flotante,, no se puede reasignar su valor
		//Cuando la variable es final, se declara en mayúculas
		
		
	}

}
