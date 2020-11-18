package Robo;

/**
 * @author Diego S da Silva
 */




public class App {
	public static void main(String [] args) {
		Robo objRobo = new Robo();
		Caixa objCaixa = new Caixa();
		Mundo2D objSala = new Mundo2D();
		for (int d = 0; d < 4; d++) {
			for(int j = 1; j <= 10; j++) {
				objRobo.printPos();
				switch(d) {
				 case 0 :
					 objRobo.move(50 + j * 4, 50);
					 
					 break;
				 
				 case 1:
					 objRobo.move(50, 50 + j * 4);
					 
					 break;
				 
				 case 2:
					 objRobo.move(90 - j * 4, 90);
					 
					 break;
					 
				 case 3:
					 objRobo.move(70, 50 - j * 4);
				
					 break;
				}
			}
		}
	
		objRobo.printPos();
		objRobo.printStatus();
	  objCaixa.printStatus2();
	  objSala.printStatus3();
	}
	
}
