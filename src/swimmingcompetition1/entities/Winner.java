
package swimmingcompetition1.entities;
import javax.swing.*;
public class Winner extends JFrame{
    private long time;
    private String name;
    
    @Override
    public void setName(String name){
        this.name=name;
    }
    public void setTime(long time){
        this.time=time;
    }
    @Override
    public String getName(){
        return this.name;
    }
    public double getTime(){
        return this.time;
    }    
}

