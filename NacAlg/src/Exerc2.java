import java.util.Scanner;

public class Exerc2 {
//faixa de consumo
//20m� = 2.00r$/m�
//20m� at� 35m� = 3,5R$/m�
//35m� at� 50m� = 5,5R$/m�
//50,00001m� = 7.0R$/m�
//em rela��o a media anterior:
//< m� == 20% desconto
//> m�+10% == 30% acresc
//
//entrada - media de consumo do ano anterior & media atual
//saida - valor total da conta - valor de multa ou desconto se houver
	
	public static void main(String args[]){
		
	Scanner leia = new Scanner(System.in);
	
	double valAnoPass, valVig, dif, total;
	
	System.out.print("Digite a media de consumo do ano passado: ");
	valAnoPass = leia.nextDouble();
	System.out.print("Digite a media de consumo desse ano: ");
	valVig = leia.nextDouble();
	
	if (valVig <= 20){
		total = valVig * 2;
	}else{
		if (valVig <= 35){
			total = valVig * 3.5;
		}else{
			if(valVig <= 50){
				total = valVig * 5.5;
			}else{
				total = valVig * 7;
			}
		}
	}
	if (valVig < valAnoPass){
		total = total * 0.8;
		System.out.print("O valor total da sua conta �: "+total+", voc� teve desconto de 20%. Continue assim!");
	}else{
		if (valVig > (valAnoPass * 1.1)){
			total = total * 1.3;
			System.out.print("Valor total da conta �: "+total+", sua conta teve multa de 30%, economize!");
		}else{
			System.out.print("Sua conta �: "+total);
		}
	}		
	}
}
