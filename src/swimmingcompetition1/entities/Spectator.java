package swimmingcompetition1.entities;
import java.util.ArrayList;
public class Spectator extends Person{
    ArrayList<Spectator> arrayms= new ArrayList<Spectator>();
    private boolean status;
    private static int numberOfSpectators=0; // to keep track of number of  Spectators
    public Spectator(){
        ++numberOfSpectators;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id= id;
    }
    public static int getNumberOfSpectators(){ // method to get the number of Spectators returned
        return numberOfSpectators;
    }
    
    public void update(boolean status){
        this.status= status;
        System.out.println(status+name);
    }
}