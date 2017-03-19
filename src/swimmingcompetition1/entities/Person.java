package swimmingcompetition1.entities;
public abstract class Person {
    protected String id;// to create people who have some common features. class is abstract to avoid creation of unnecessary person objects. cannot make it an interface as it contains methods
    protected String name; // name is used in sub classes
    private static int numberOfPeople=0; // static variable to keep track of number of people objects created
    public Person(){
        ++numberOfPeople; // as the constuctor is called in a object creation, it would increase the variable by 1 
    }
    public static int getNumberOfPeople(){ //getter method to get the number of people returnd, as numberOfPeople is private to the class
        return numberOfPeople;
    }
    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.id;
    }
    
}
































