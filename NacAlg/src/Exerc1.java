import java.util.Scanner;
public class Exerc1 {
	public static void main(String[] args) {
		
		int qtdAula;
		double valorHr;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a qtd de aulas por semana: ");
		qtdAula = leia.nextInt();
		System.out.print("Digite o valor da aula: ");
		valorHr = leia.nextDouble();
		
		double salBase = (qtdAula * 4.5 * valorHr);
		double dsr = salBase/6;
		double hrAtiv = (0.05*(salBase + dsr));
		double salTotal = salBase + hrAtiv + dsr;
		
		System.out.println("O salario base �: "+ salBase +"\nO valor da hora atividade �: "+hrAtiv+"\nO Valor do DSR �: "
		+dsr+"\nO salario total �: "+salTotal);
	}
}
