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
			System.out.print("N�o possui raizes reais! ");
			System.out.print("Digite novamente os valores \n Digite o valor de a: ");
			a = leia.nextDouble();
			
			System.out.print("Digite b: ");
			b = leia.nextDouble();
			
			System.out.print("Digite c: ");
			c = leia.nextDouble();
			
		}
		
		delta = b*b - 4*a*c;
		
		if (delta < 0){
			System.out.print("Porra voc� � burro msm hein? Desse jeito eu n�o posso te ajudar \n n�o sei pq vc ta tentando algo t�o dificil, volta pro 2+2!");
		}
		
	}
		
}
