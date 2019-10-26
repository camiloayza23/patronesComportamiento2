package bridgePractice2;

public class Windows implements IPlataforma {

	private IArquitectura arquitectura;
	
	public Windows (IArquitectura arqui) {
		this.arquitectura=arqui;
	}
	@Override
	public void install() {
		System.out.println("Instalando Windows..");
		arquitectura.defArquitectura();
	}

}

