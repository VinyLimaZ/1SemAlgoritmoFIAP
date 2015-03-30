import java.util.Scanner;

public class Bhaskara {
	public static void main (String[] args){
		Scanner leia = new Scanner(System.in);
		double a, b, c;
		System.out.println("Digite a: ");
		a = leia.nextDouble();
		
		System.out.print("Digite b: ");
		b = leia.nextDouble();
		
		System.out.print("Digite c: ");
		c = leia.nextDouble();
		
		double delta = b*b - 4*a*c;
		
		if (delta < 0){
			System.out.print("Não possui raizes reais! ");
			System.out.print("Digite novamente os valores \n Digite o valor de a: ");
			a = leia.nextDouble();
			
			System.out.print("Digite b: ");
			b = leia.nextDouble();
			
			System.out.print("Digite c: ");
			c = leia.nextDouble();
			
		}
		
		delta = b*b - 4*a*c;
		
		if (delta < 0){
			System.out.print("Porra você é burro msm hein? Desse jeito eu não posso te ajudar \n não sei pq vc ta tentando algo tão dificil, volta pro 2+2!");
		}
		
	}
		
}
