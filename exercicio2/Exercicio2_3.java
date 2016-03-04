public class ContaBancaria2 {

	Integer agencia;
	Integer contaCorrente;
	double saldo; 
	double limiteExtra;
	String titularConta;

	public void imprimirSaldo(){
		System.out.println("Saldo: " +this.saldo);
	}

	public void imprimirLimiteExtra(){
		System.out.println("Limite extra: " +this.limiteExtra);
	}

	public void imprimirAngencia(){
		System.out.println("A agência é: " +this.agencia);
	}

	public void imprimirContaCorrente(){
		System.out.println("A conta-corrente é: " +this.contaCorrente);
	}

	public void imprimirTitular(){
		System.out.println("O titular da conta é: " +this.titularConta);
	}

	public static void main(String [] args) {

	ContaBancaria2 cb = new ContaBancaria2();
		cb.titularConta = "Rafaela Silva";
		cb.imprimirTitular();

	ContaBancaria2 cb1 = new ContaBancaria2();
		cb1.agencia = 3610;
		cb1.imprimirAngencia();

	ContaBancaria2 cb2 = new ContaBancaria2();
		cb2.contaCorrente = 15766;
		cb2.imprimirContaCorrente();

	ContaBancaria2 cb3 = new ContaBancaria2();
		cb3.saldo = 35.54;
		cb3.imprimirSaldo();

	ContaBancaria2 cb4 = new ContaBancaria2();
		cb4.limiteExtra = 50;
		cb4.imprimirLimiteExtra();


	ContaBancaria2 cb2_1 = new ContaBancaria2();
		cb2_1.titularConta = "Bruna";
		cb2_1.imprimirTitular();

	ContaBancaria2 cb2_2 = new ContaBancaria2();
		cb2_2.agencia = 810;
		cb2_2.imprimirAngencia();

	ContaBancaria2 cb2_3 = new ContaBancaria2();
		cb2_3.contaCorrente = 6132;
		cb2_3.imprimirContaCorrente();

	ContaBancaria2 cb2_4 = new ContaBancaria2();
		cb2_4.saldo = 42.31;
		cb2_4.imprimirSaldo();

	ContaBancaria2 cb2_5 = new ContaBancaria2();
		cb2_5.limiteExtra = 75;
		cb2_5.imprimirLimiteExtra();

	}
}
