package bridgePractice2;

public class MacOS implements IPlataforma {

	private IArquitectura arquitectura;
	
	public MacOS (IArquitectura arqui) {
		this.arquitectura=arqui;
	}
	@Override
	public void install() {
		System.out.println("Instalando MacOS..");
		arquitectura.defArquitectura();
	}

}
