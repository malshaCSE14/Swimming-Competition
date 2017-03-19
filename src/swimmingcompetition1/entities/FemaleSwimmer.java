package swimmingcompetition1.entities;
import javax.swing.JLabel;
public class FemaleSwimmer extends Swimmer{
    private static int numberOfFSwimmers=0; // to keep track of female swimmers
    public FemaleSwimmer(){
        this.wear="RED";
        ++numberOfFSwimmers;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id= id;
    }
    public static int getNumberOfFSwimmers(){ // method to return the instances of Female swimmers
        return numberOfFSwimmers;
    }
    public FemaleSwimmer(JLabel l, String swimmerName, JLabel t) {
        super(l,swimmerName,t);
    }
}
