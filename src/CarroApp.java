
public class CarroApp {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setCor("verde");
		carro.setModelo("f-320");
		carro.setVelocidadeAtual(0);
		carro.setVelocidadeMaxima(300);
		
		carro.ligar();
		carro.acelerar(10);
		System.out.println(carro);
		carro.acelerar(10);
		System.out.println(carro);
		carro.acelerar(10);
		System.out.println(carro);
		carro.acelerar(10);
		System.out.println(carro);
		carro.acelerar(10);
		System.out.println(carro);
		carro.acelerar(10);
		System.out.println(carro);
		carro.acelerar(300);
		System.out.println(carro);
	}

}
