package compositeExample2;

public class Client {
    public static void main(String []args){
        Composite subTask = new Composite(7);
        subTask.add(new Item(1));
        subTask.add(new Item(1));
        subTask.add(new Item(2));
     
        Composite subTask2 = new Composite(7);
        subTask.add(new Item(1));
        subTask.add(new Item(1));
        subTask.add(new Item(2));
        
        Composite subTask3 = new Composite(7);
        subTask.add(new Item(1));
        subTask.add(new Item(1));
        subTask.add(new Item(2));
        
        Composite subTask4 = new Composite(7);
        subTask.add(new Item(1));
        subTask.add(new Item(1));
        subTask.add(new Item(2));
     
        Composite task = new Composite(6);
        
        task.add(subTask);
        task.add(subTask2);
        
        Composite task2 = new Composite(6);
        
        task2.add(subTask3);
        task2.add(subTask4);
        
        Composite userStory = new Composite(6);
        
        userStory.add(task);
        userStory.add(task2);
        
        userStory.estimacion();
    }
}