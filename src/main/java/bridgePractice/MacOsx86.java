package bridgePractice;

public class MacOsx86  implements MacOS{

	@Override
	public void install() {
		System.out.println("Instalando MacOS...");
	}

	@Override
	public void soloMacOS() {
		System.out.println("Solo MacOS puede hacer esto...");
	}

}
