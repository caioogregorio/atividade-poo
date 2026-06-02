package abstração;

public class DepartamentoFinanceiro extends RedeDeHotelaria {
	
	DepartamentoFinanceiro(String nome){
		super(nome);
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Departamento financeiro: " + nome);
	}
}
