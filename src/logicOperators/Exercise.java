package logicOperators;

import java.util.Scanner;


public class Exercise {
	
	public static void main(String[] args) {
		/*
		 *Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iPhone 15 cada uno. La tienda tiene una promoción por el mes patrio: 		"Si el total de tu compra supera los 25 mil pesos, obtén un 10% de descuento". Enrique, Paola y Mariana deciden comprar los tres equipos con una 		sola tarjeta. Al llegar a caja, la cajera les menciona que la tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo 		tanto, deciden pagar con la TDC de Mariana. ¿Cuál sería el costo total por los 3 equipos sin descuento? ¿Aplicaría el descuento en su compra? ¿Cuál 		sería el costo total con el descuento aplicado? ¿Cuánto pagarían mensualmente?
		 *El precio del Iphone es de 20,000 pesos.
		 */
		
		//Solución
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, bienvenidos a la Mac Store");
		System.out.println("¿Cuántos equipos desean adquirir?");
		int equiposIp = sc.nextInt();
		int total = 20000 * equiposIp;
		System.out.println("Les comento que el costo por Iphone es de 20,000 pesos, por lo que el total sería de: " + total + " pesos.");
		System.out.println("¿Desean seguir con la operación?");
		System.out.println("Escriba 1 = SI o 2 = NO");
		int operacion = sc.nextInt();
		
		switch (operacion) {
		case 1: 
			if (total > 25000) {
				System.out.println("Son elegibles para un descueto del 10%");
				double rebaja = total * 0.10;
				double costoFinal = total - rebaja;
				System.out.println("El costo final quedaría en " + costoFinal + " pesos.");
				System.out.println("Desean pagar a 12 meses sin intereses?");
				System.out.println("Escriba 1 = SI o 2 = NO");
				int mesesOpc = sc.nextInt();
				if (mesesOpc == 1) {
					double mensualidades = costoFinal / 12;
					System.out.println("Su pago queda en " + mensualidades + " pesos al mes.");
					System.out.println("Gracias por su compra.");
				}else {
					System.out.println("Su pago es de " + costoFinal);
					System.out.println("Gracias por su compra.");
				}
				
			}else {
				System.out.println("Desean pagar a 12 meses sin intereses?");
				System.out.println("Escriba 1 = SI o 2 = NO");
				int mesesOpc = sc.nextInt();
				if (mesesOpc == 1) {
					double mensualidades = total / 12;
					System.out.println("Su pago queda en " + mensualidades + " pesos al mes.");
					System.out.println("Gracias por su compra.");
				}else {
					System.out.println("Su pago es de " + total);
					System.out.println("Gracias por su compra.");
				}
			
			}
			break;
		default:
			System.out.println("Gracias por su visita.");
			break;
			
		}
		
		
		sc.close();
		
	}

}
