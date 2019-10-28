package proxyExample;

public class Server implements IServer {

	Request request;
	
	
	public Server(Request request) {
		this.request = request;
	}


	@Override
	public void request() {
		System.out.println("Real request Subject: " + this.request.getPort() + this.request.getUrl());
	}

}
