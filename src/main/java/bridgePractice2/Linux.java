package bridgePractice2;

public class Linux implements IPlataforma {

	private IArquitectura arquitectura;
	
	public Linux (IArquitectura arqui) {
		this.arquitectura=arqui;
	}
	@Override
	public void install() {
		System.out.println("Instalando Linux..");
		arquitectura.defArquitectura();
	}

}
