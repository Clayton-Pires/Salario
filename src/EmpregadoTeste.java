
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1, e2;

		e1 = new Empregado();
		e2 = new Empregado();
		
		e1.setNome("Antonio");
		e1.setCargo("Analista");
		e1.setSalario(5000);
		e1.imprimir();
		e1.aumentarSalario(30);
		e1.imprimir();
		
		e2.setNome("Clayton");
		e2.setCargo("Sofredor");
		e2.setSalario(2000);
		e2.imprimir();
		e2.aumentarSalario(30);
		e2.imprimir();
				
		}

}
