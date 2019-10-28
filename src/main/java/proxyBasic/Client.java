package proxyBasic;

public class Client {
	public static void main(String[] args) {
		// Create proxy
		
		ISubject proxy = new Proxy("filter ajskd");
		proxy.request();
		
	}
}
