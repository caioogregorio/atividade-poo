package abstração;

public class SetorDeRH extends DepartamentoFinanceiro{

	public SetorDeRH(String nome) {
		super(nome);
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Setor de RH: " + nome);
	}
	
	public void contratar() {
		System.out.println("Contratação padrão.");
	}
	
	public void contratar(String funcionario) {
		System.out.println("Contratando: " + funcionario);
	}
}
