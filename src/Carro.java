
public class Carro {

	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	
	public Carro (){
		
	}

	public void ligar(){
		System.out.println("Carro ligado...");
	}
	public void acelerar(int acelerar){
		int va = getVelocidadeAtual() + acelerar;
		if (va>= getVelocidadeMaxima()){
			System.out.println("Execida a velocidade maxima de: " + getVelocidadeMaxima());
		}else{
			setVelocidadeAtual(va);
		}
		

	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", velocidadeAtual=" + velocidadeAtual
				+ ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}
	
}
