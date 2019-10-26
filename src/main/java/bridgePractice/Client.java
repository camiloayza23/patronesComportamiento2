package bridgePractice;

public class Client {
	public static void main(String[] args) {
		Windows7x64 wind = new Windows7x64();
		Linuxx86 linux = new Linuxx86();
		MacOsx64 mac = new MacOsx64();
		
		wind.soloWindows();
		linux.install();
		mac.soloMacOS();
	}
}
