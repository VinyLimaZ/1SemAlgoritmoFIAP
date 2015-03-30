import java.util.Scanner;

public class Triangulo {

	public static void main (String[] args){
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a base: ");
		double base = leia.nextDouble();
		System.out.println("Digite a altura: ");
		double alt = leia.nextDouble();
		System.out.println("Classifica��o: ");
		leia.nextLine(); //Limpando buffer do teclado5
		String classif = leia.nextLine();
		double area = base * alt / 2;
		System.out.println("A area � "+area+" O triangulo �: "+classif);
	}
}
