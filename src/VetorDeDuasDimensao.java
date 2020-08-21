
public class VetorDeDuasDimensao {

	public static void main(String[] args) {
		Double [] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double [] faturamentoFevereiro = new Double[] {2500.0, 3000.0, 2700.0};
				Double [][] faturamentoAnual = new Double[][] {faturamentoFevereiro,faturamentoJaneiro};
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("mes: " + (i+1));
			Double[] mes = faturamentoAnual[i];
		
			for (int y = 0; y < mes.length; y++) {
				Double dia = mes[y];
				System.out.println("dia: " + (y +1 ) +" "+ dia);
			}
		
		}
		
	}
	} 

