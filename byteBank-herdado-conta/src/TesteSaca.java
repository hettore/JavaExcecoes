
public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(1235, 321);
		
		conta.deposita(200.00);
		try {			
			conta.saca(210.00);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(conta.saldo);
		
	}

}
