import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Práctica 9.
 */
public class EjercicioEnrique {
	public static void main(String[] args) {

		boolean continuarBucle = true;

		while (continuarBucle) {

			String opcionMenu = JOptionPane.showInputDialog(
					"¿Qué quieres hacer?\n1.- Imprimir los n primeros números naturales\n2.- Imprimir un triángulo rectángulo con números.\n3.- Imprimir un triángulo rectángulo invertido con números\n4-Suma acumulada\n5-Imprimir tabla de multiplicar\n6-Números pares\n7-Números primos\n8-Jugar a piedra, papel o tijera\n9-Salir.");

			int numOpcionMenu = Integer.parseInt(opcionMenu);

			if (numOpcionMenu == 1) {

				int entero;
				int i = 0;

				entero = Integer.parseInt(JOptionPane.showInputDialog("Escribe una entero"));

				while (i < entero) {

					System.out.println(+i + "[ debe llegar hasta el: " + entero + " ]");

					i++;

				}

			}

			else if (numOpcionMenu == 2) {

				int numingresado = 0, valorinicial = 0, a = 0;
				Scanner tecla = new Scanner(System.in);
				System.out.println("Escribe hasta que numero llegará la piramide: ");

				numingresado = tecla.nextInt();
				for (valorinicial = 0; valorinicial <= numingresado; valorinicial++) {
					for (a = 0; a <= valorinicial; a++) {
						System.out.print(" " + a);
					}
					System.out.println();

				}

			}

			else if (numOpcionMenu == 3) {

				int numingresado = 0, valorinicial = 0, a = 1;
				Scanner tecla = new Scanner(System.in);
				System.out.println("Escribe hasta que numero llegará la piramide: ");

				numingresado = tecla.nextInt();

				for (valorinicial = numingresado; valorinicial >= 0; valorinicial--) {
					for (a = 1; a < valorinicial; a++) {

						System.out.print("" + a);
					}
					System.out.println();
				}

			}

			else if (numOpcionMenu == 4) {

				Scanner sc = new Scanner(System.in);
				int n;
				System.out.print("Introduce un número y se hace la suma acumulada: ");
				n = sc.nextInt();

				int Sacumulada = 0;
				int iContador = n;

				System.out.print(iContador + " + ");

				while (iContador > 0) {

					Sacumulada = Sacumulada + iContador;
					iContador--;
					System.out.print(iContador + " + ");
				}

				System.out.print("= " + Sacumulada);

			}

			else if (numOpcionMenu == 5) {

				Scanner sc = new Scanner(System.in);
				int n;
				System.out.print("Introduce un número entero: ");
				n = sc.nextInt();
				System.out.println("Tabla del " + n);
				for (int i = 1; i <= 10; i++) {
					System.out.println(n + " * " + i + " = " + n * i);

				}

			}

			else if (numOpcionMenu == 6) {

				int numingresado = 0;
				int f = 0;

				Scanner tecla = new Scanner(System.in);
				System.out.println("suma acumulada del numero que escribas debajo");

				numingresado = tecla.nextInt();

				System.out.println("los numeros del " + numingresado + " hasta el 0 son: ");

				while (f < numingresado) {

					System.out.print(f + ",");
					f = f + 2;
				}

				System.out.println("Total de numeros pares: " + numingresado / 2);

			}

			else if (numOpcionMenu == 7) {

				Scanner scanner = new Scanner(System.in);
				int i = 0;
				int num = 0;

				String NumPrimo = "";
				System.out.println("Pon un numero:");
				int n = scanner.nextInt();
				scanner.close();
				for (i = 1; i <= n; i++) {
					int contador = 0;
					for (num = i; num >= 1; num--) {
						if (i % num == 0) {
							contador = contador + 1;
						}
					}
					if (contador == 2) {

						NumPrimo = NumPrimo + i + " ";
					}
				}
				i = i - 1;

				System.out.println("Los numeros primos de " + i + " a 0 son:");
				System.out.println(NumPrimo);

			}

			else if (numOpcionMenu == 8) {

				System.out.println("Piedra, Papel o Tijera");
				Scanner teclado = new Scanner(System.in);

				int ordenadorElec = (int) (Math.random() * 3) + 1;

				System.out.print("Que elijes? [1=Piedra, 2=Papel, 3=Tijera]: ");
				int seleccionUsuario = teclado.nextInt();

				System.out.print("El ordenador elijio: ");
				switch (ordenadorElec) // resultados
				{
				case 1:
					System.out.println("Piedra"); // si eligr piedra
					switch (seleccionUsuario) {
					case 1:
						System.out.println("Empate");
						break;// piedra
					case 2:
						System.out.println("has perdido");
						break;// papel
					case 3:
						System.out.println("has ganado");
						break;// tijera
					}
					break;

				case 2:
					System.out.println("Papel"); // si es papael
					switch (seleccionUsuario) {
					case 1:
						System.out.println("has ganado");
						break;// piedra
					case 2:
						System.out.println("Empate");
						break;// papel
					case 3:
						System.out.println("has perdido");
						break;// tijera
					}
					break;

				case 3:
					System.out.println("Tijera"); // tijera
					switch (seleccionUsuario) {
					case 1:
						System.out.println("has perdido");
						break;// piedra
					case 2:
						System.out.println("has ganado");
						break;// papel
					case 3:
						System.out.println("Empate");
						break;// tijera
					}
					break;

				}

			}

			else { // Opción salir
				continuarBucle = false;
				JOptionPane.showMessageDialog(null, "Gracias por utilizar esta aplicación. Hasta pronto.");
				// Existen otras opciones para finalizar el programa, se podría invocar a
				// "return;" (sale del programa) o "break;" (se sale del bucle)
			}

		}
	}
}