package unico;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/* La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad
 * y nos ha pedido hacer un configurador que calcule el precio según el alto y el ancho.
 * El precio base de una bandera es de un céntimo de euro el centímetro cuadrado. Si la
 * queremos con un escudo bordado, el precio se incrementa en 2.50 € independientemente del
 * tamaño. Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.
*/

			final double PRECIOCM2 = 0.01;
			final double ENVIO = 3.25;
		
			int altura;
			int anchura;
			int bandera;
			String conEscudo;
			String escudo;
			double precioEscudo;
			double precioBandera;
			double precioTotal;
		
			System.out.print("Introduzca la altura de la bandera en cm: ");
			altura = Integer.parseInt(teclado.nextLine());
			System.out.print("Ahora introduzca la anchura: ");
			anchura = Integer.parseInt(teclado.nextLine());
			System.out.print("¿Quiere escudo bordado? (s/n): ");
			conEscudo = teclado.nextLine();
			
			bandera = anchura*altura;
			precioBandera = bandera * 0.01;	
			
			if (conEscudo.equalsIgnoreCase("s")){
				escudo = "Con escudo";
				precioEscudo = 2.50;
			} else {
				escudo = "Sin escudo";
				precioEscudo = 0.00;
			}
			
			precioTotal = precioBandera + precioEscudo + ENVIO;
			
			System.out.println("Gracias. Aquí tiene el desglose de su compra.");
			System.out.println("Bandera de " + bandera + "cm2: " + precioBandera + " €");
			System.out.println(escudo + ": " + precioEscudo + " €");
			System.out.println("Gastos de envío: " + ENVIO + " €");
			System.out.println("Total: " + precioTotal + " €");
	}
}