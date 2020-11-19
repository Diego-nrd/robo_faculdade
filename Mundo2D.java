/**
 * 
 * @Author Diego S da Silva
 * 
 */

package Simulator.code;

public class Mundo2D {
	
public final int dimensaoX;
public final int dimensaoY;

	
	public Mundo2D() {
		
		this.dimensaoX = 35;
		this.dimensaoY = 25;
		
	}
	
	
	public void printStatus3() {
		System.out.println("-----------------INFO Da Caixa-----------------");
		System.out.println("Dimensões da Sala: " + "Dimensão X " + dimensaoX + "m" + "Dimensão Y " + dimensaoY + "m" );
		System.out.println("---------------------Fim------------------");
	}
	
}
