package compositeExample;

public class Client {
    public static void main(String []args){
        Composite kitProduct = new Composite("composite root1");
        kitProduct.add(new Product("Product1"));
        kitProduct.add(new Product("Product2"));
        kitProduct.add(new Product("Product3"));
     
        Composite kitProduct2 = new Composite("composite root1");
        kitProduct2.add(new Product("Product1"));
        kitProduct2.add(new Product("Product2"));
        kitProduct2.add(new Product("Product3"));
        
        Composite boxProducts = new Composite("composite root2");
        
        boxProducts.add(kitProduct);
        boxProducts.add(kitProduct2);
        
        boxProducts.print();
    }
}