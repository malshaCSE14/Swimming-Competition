package swimmingcompetition1.entities;
import java.util.ArrayList;
public class Judge extends Person{  
    private static int numberOfJudges=0; // to keep track of number of judges
    public Judge(){
        ++numberOfJudges;
    }
    public static int getNumberOfJudges(){ // method to get the number of judges returned
        return numberOfJudges;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id= id;
    }
    public boolean blowWistle(boolean status){
        return status;
    }
    public static void requestResults(ArrayList<Winner> w){
    }
    
}