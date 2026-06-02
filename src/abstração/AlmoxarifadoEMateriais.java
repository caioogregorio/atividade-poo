package abstração;

public class AlmoxarifadoEMateriais extends DepartamentoFinanceiro {

	public AlmoxarifadoEMateriais(String nome) {
		super(nome);
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Almoxarifado: " + nome);
	}
	
	public void registrarMaterial() {
		System.out.println("Material registrado");
	}
	
	public void registrarMaterial(String material) {
        System.out.println("Material: " + material);
    }
}
