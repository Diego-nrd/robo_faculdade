/**
 * 
 * @Author Diego S da Silva
 * 
 */

package Simulator.code;

public class Caixa extends caixaIdeia{

public String nome_Item; 
public int qtd; 
	
	
	public Caixa() {
		 
		 this.nome_Item = "HD'S";
		 this.qtd = 35;
		 this.peso = 17.5;
		 this.dimensaoC = 27;
		 this.dimensaoL = 36;
		 this.dimensaoA = 18;
		 this.posicaoX = 80;
		 this.posicaoY = 75;
		 
	 }
	
	 
	 public void printStatus2() {
		 System.out.println("-----------------INFO Da Caixa-----------------");
		 System.out.println("Contêudo da Caixa " + nome_Item);
		 System.out.println("Quantidade de Item "+ qtd + ":QTD");
		 System.out.println("Peso de Caixa" + peso + "Kg");
		 System.out.println("Dimensão da Caixa: " + "Comprimento " + dimensaoC + "Cm" + " Largura " + dimensaoL + "Cm" +  " Altura " + dimensaoA + "Cm");
		 System.out.println("Posição da Caixa:" + " Posicao X " + posicaoX +   "," + " Posicao Y " + posicaoY);
		 System.out.println("---------------------Fim------------------");
	 }
	 
	 
	 public String toString() {
		 
		 return "Caixa{"+ "Nome Intem = " + nome_Item + ", Quantidade = " + qtd + '}';
		 
	 }
		
}
