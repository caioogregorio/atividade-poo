package abstração;

abstract class RedeDeHotelaria {

	protected String nome;
	
	public RedeDeHotelaria(String nome) {
		this.nome = nome;
	}
	
	public abstract void exibirInfo();
}
