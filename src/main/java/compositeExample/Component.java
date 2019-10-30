package compositeExample;

abstract class Component {
	private String name;

	public Component(String attribute) {
		this.name = attribute;
	}

	public String getName() {
		return name;
	}
	
	public abstract void print();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position);
}
