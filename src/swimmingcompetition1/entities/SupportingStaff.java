package swimmingcompetition1.entities;
import java.util.ArrayList;
public class SupportingStaff extends Person{
    ArrayList<SupportingStaff> arrayms= new ArrayList<SupportingStaff>();
    private static int numberOfMembers=0; // to keep track of number of  Members
    public SupportingStaff(){
        ++numberOfMembers;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id= id;
    }
    public static int getNumberOfMembers(){ // method to get the number of Members returned
        return numberOfMembers;
    }
    public static void requestResults(ArrayList<Winner> w){
        
    }

}

