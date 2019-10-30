package compositeBasic;

abstract class Component {
	private String attribute;

	public Component(String attribute) {
		this.attribute = attribute;
	}

	public String getAttribute() {
		return attribute;
	}
	
	public abstract void operation();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position);
}
