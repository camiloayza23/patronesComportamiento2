package bridgePractice;

public class Windows7x86 implements Windows{

	@Override
	public void install() {
		System.out.println("Instalando Windows...");
	}

	@Override
	public void soloWindows() {
		System.out.println("Solo Windows puede hacer esto...");
	}

}
