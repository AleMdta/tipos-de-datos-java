package dataTypes;


public class DatosPrimitivos {
	
	public static void main (String[] args) {
		/*
		 * Datos primitivos: Datos fundamentales de Java
		 *  que sirven para gestionar los tipos de información más básicos.
		 *  Existen 8 tipos de datos primitivos
		 */
		
		//byte age = 26; //Si la variable no es utilizada en el código, java nos la señala
		
		//Vmin y Vmax de los tipos de datos primitivos
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		
		System.out.println("Valor máximo de byte: " + maxByte + "\n" + "Valor mínimo de byte:" + minByte);
		
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		
		System.out.println("Valor máximo de Short: " + maxShort + "\n" + "Valor mínimo de Short:" + minShort);
		
		char maxChar = Character.MAX_VALUE; //Es un espacio en ASCII
		char minChar = Character.MIN_VALUE; //Es un null en ASCII
		
		System.out.println("Valor máximo de Caracter: " + maxChar + "\n" + "Valor mínimo de Caracter:" + minChar);
		
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		System.out.println("Valor máximo de Entero: " + maxInt + "\n" + "Valor mínimo de Entero: " + minInt);
		
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		
		System.out.println("Valor máximo de Long: " + maxLong + "\n" + "Valor mínimo de Long:" + minLong);
		
		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		
		System.out.println("Valor máximo de Double: " + maxDouble + "\n" + "Valor mínimo de Double:" + minDouble);
		
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		
		System.out.println("Valor máximo de Flotante: " + maxFloat + "\n" + "Valor mínimo de Flotante:" + minFloat);
		
		char valorChar1 = 3;
		char valorChar2 = 2;
		System.out.println(valorChar1);
		
		/* Casteo ( Conversion de tipos en Java).
		   -- Automatico (dato mas pequeño a un dato más grande)
		   -- Manual (tipop de dato más grande a tipo de dato más pequeño)
		 */
		//int < double -> conversión de valores más chicos a más grandes
		int myNumber = 125;
		double myCasting = myNumber;
		
		//Casteo manual -> conversión de valores más grandes a más chicos
		int myNewCasting = (int) myCasting;
		
		//Convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//Conversión (manual)
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		//Convertir de char a int (auto)
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
		
		
		
		
		
		
	}

}
