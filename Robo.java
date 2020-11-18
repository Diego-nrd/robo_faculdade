package Robo;

/**
 * @author Diego S da Silva
 */

public class Robo {
 final String nome;
 final float  peso;
 final float velocidadeMaxima = 5;
 final float cargaMaxima = 20;
 final String tipoTracao = "Esteira";
  int orientacao;
    static final int frente = 0;
    static final int atras = 1;
    static final int esquerda = 2;
    static final int direita = 3;
    
    float posicaoX;
	float posicaoY;
      	
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
		System.out.println("(x, y) = (" + posicaoX + ", " + posicaoY + ")");
	}

	
}
