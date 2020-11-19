/**
 * 
 * @Author Diego S da Silva
 * 
 */

package Simulator.code;
public class Robo {

private final String nome;
private final float  peso;
private final float velocidadeMaxima = 5;
private final float cargaMaxima = 20;
private final String tipoTracao = "Esteira";
private  int orientacao;
public   static final int frente = 0;
public   static final int atras = 1;
public   static final int esquerda = 2;
public   static final int direita = 3;
    
private  float posicaoX;
private  float posicaoY;
      	
	public Robo(){
	
		this.nome = "R-ATM";
		this.peso = 70;
	}	
	public void move(float posX, float posY){
		
		this.posicaoX = posX;
		this.posicaoY = posY;
		
	}
	
	public void moveX(float dist) {
		this.posicaoX += dist;
	}
	
	public void moveY(float dist) {
		this.posicaoY += dist;
	}
		
	public void setOrientacao(char tecla) {
		if(tecla == 'W') {
			this.orientacao = frente;
			
		}else if (tecla == 'A') {
			this.orientacao = esquerda;
				
		}else if (tecla == 'D') {
			this.orientacao = direita;
			
		}else if (tecla == 'S') {
			this.orientacao = atras;
			
		}	
	}
	public void printStatus() {
	 System.out.println("-----------------INFO DO Robô-----------------");
	 System.out.println("Robô de Transporte de Mercadoria: " + nome);
	 System.out.println("Peso do Robô: " + peso + "Kg");
	 System.out.println("Velocidade Maxima do Robô: " + velocidadeMaxima + "Km");
	 System.out.println("Carga Maxima Suportada: " + cargaMaxima + "Kg");
	 System.out.println("Tipo de Tração: " + tipoTracao);
	 System.out.println("Posição X: " + posicaoX + " Posição Y: " + posicaoY);
	 System.out.println("--------------------Fim------------------");
	 
	}
	
	public void printPos() {
		System.out.println("-----------------INFO MOVIMENTÇÕES DO ROBÔ-----------------");
		System.out.println("Movimentos do eixo do Robo:" + " EixoX " + posicaoX + " EixoY "+ posicaoY );
		System.out.println("-----------------------------Fim----------------------------");
	}

	
	public float getPoiscaoX() {
		return posicaoX;
		
	}
	
	public float getPosicaoY() {
		
		return posicaoY;
	}
	
	public int orientacao() {
		
		return orientacao;
			
	}
	
	public String toString() {
		return "Robo{"+"PosiçãoX = " + posicaoX + ", PosiçãoY = " + posicaoY + ", orientação=" + orientacao + '}';
		
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Robo) {
			Robo robo = (Robo)obj;
			return this.nome.equals(robo.nome);
			
		}else{
			
			return false;
		}
	}		
}
