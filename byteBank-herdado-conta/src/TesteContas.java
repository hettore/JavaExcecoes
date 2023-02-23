
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(111, 235468);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 123456);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo cc " + cc.getSaldo());
		System.out.println("Saldo cp " + cp.getSaldo());

	}

}
