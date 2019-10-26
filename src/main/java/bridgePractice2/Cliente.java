package bridgePractice2;

public class Cliente {
	public static void main(String[] args) {
		Arquitecturax86 arquix86 = new Arquitecturax86();
		Arquitecturax64 arquix64 = new Arquitecturax64();
		
		Windows win = new Windows(arquix86);
		win.install();
		
		Linux lin = new Linux(arquix64);
		lin.install();
		
		MacOS mac = new MacOS(arquix86);
		mac.install();
	}
}
