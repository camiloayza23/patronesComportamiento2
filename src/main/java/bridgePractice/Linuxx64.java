package bridgePractice;

public class Linuxx64 implements Linux{

	@Override
	public void install() {
		System.out.println("Instalando Linux...");
	}

	@Override
	public void soloLinux() {
		System.out.println("Solo Linux puede hacer esto...");
	}

}
