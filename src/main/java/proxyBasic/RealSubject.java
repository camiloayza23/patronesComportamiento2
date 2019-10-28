package proxyBasic;

public class RealSubject implements ISubject {

	String attribute;
	
	
	public RealSubject(String attribute) {
		this.attribute = attribute;
	}


	@Override
	public void request() {
		System.out.println("Real request Subject: " + this.attribute);
	}

}
