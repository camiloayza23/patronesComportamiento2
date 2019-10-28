package proxyExample;

public class Client {
	public static void main(String[] args) {
		// Create proxy
		
		IServer proxy = new Proxy(new Request("youtube", 90));
		proxy.request();
		
	}
}
