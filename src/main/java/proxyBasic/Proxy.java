package proxyBasic;

public class Proxy implements ISubject{

	private String attribute;
	private RealSubject realSubject = null;
		
	public Proxy(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public void request() {
		if(realSubject == null)
			realSubject = new RealSubject(attribute);
		
		// Some conditions filters
		
		if (attribute.contains("filter")) {
			this.realSubject.request();
		} else {
			System.out.println("blocked");
		}
		
	}
	
	

}
