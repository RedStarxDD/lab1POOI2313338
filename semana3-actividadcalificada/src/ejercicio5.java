import java.util.Scanner;

public class ejercicio5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un número para hallar el día de la semana: ");
		int dia=sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Día no encontrado");
			break;
		}
		sc.close();
	}
}
