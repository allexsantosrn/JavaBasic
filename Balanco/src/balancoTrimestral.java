
public class balancoTrimestral {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediamensal = gastosTrimestre/3;
		
		//Imprimindo valores
		System.out.println("Gastos do trimestre: "+gastosTrimestre);		
		System.out.println("Valor da média mensal: "+mediamensal);

	}

}
