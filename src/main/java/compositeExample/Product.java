package compositeExample;

public class Product extends Component {

    public Product(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\t Leaf : "+this.getName());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Leaf");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Leaf :"+this.getName());
    }
}
