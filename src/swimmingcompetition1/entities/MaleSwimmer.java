package swimmingcompetition1.entities;
import javax.swing.JLabel;
public class MaleSwimmer extends Swimmer{
    private static int numberOfMSwimmer=0; // to keep track of male swimmers
    public MaleSwimmer(){
        ++numberOfMSwimmer;
        this.wear="BLUE";
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id= id;
    }
    public static int getNumberOfnumberOfMaleSwimmer(){ // method to get the number of male swimmers returned
        return numberOfMSwimmer;
    }
    public MaleSwimmer(JLabel l, String SwimmerName, JLabel t) {
        super(l,SwimmerName,t);
    }
}
