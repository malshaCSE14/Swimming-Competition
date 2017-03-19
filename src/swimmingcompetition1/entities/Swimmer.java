package swimmingcompetition1.entities;
import static swimmingcompetition1.entities.ScoreBoard.winnerArray;
public abstract class Swimmer extends Person implements Runnable{ // in order to implement male and female swimmers
    javax.swing.JLabel l;
    javax.swing.JLabel t;
    private long time;
    private int speed=15;
    private String swimmerName;
    protected String wear; // male and female swimmers have different wear
    private int speed2;
    private int laneLength;
    private static int numberOfSwimmers=0; // to keep track of swimmers
    public Swimmer(){
        ++numberOfSwimmers; // increment of numberOfSwimmers within the constructor
    }
    public Swimmer(javax.swing.JLabel l, String name, javax.swing.JLabel t) {
        this.l=l;
        this.swimmerName=name;
        this.t=t; 
        this.laneLength=SwimmingLane.length;
    }
    @Override
    
    public void run(){        
        for(int i=0; i<500; i++){
            try {
                Thread.sleep((int)(Math.random()*speed*1));
            }
            catch (InterruptedException ex) {}
            l.setLocation(l.getX()+1,l.getY());
        }
        synchronized (this) {
            long finishingTime = System. currentTimeMillis();
            Touchpad tpad = new Touchpad();
            tpad.notifyFinishingTime(finishingTime);
            time = tpad.getTime();
            Winner w= new Winner();
            w.setName(swimmerName);
            w.setTime(time);
            winnerArray.add(w);
            t.setText(Long.toString(time));
        }  
    }
  
    public static int getNumberOfSwimmers(){ //returns the number of objects
        return numberOfSwimmers;
    }
    
    public void setSpeed2(int speed2){
        this.speed2=speed2;
    }

    public void butterflyStroke(){
        this.speed=30;
    }
    public void backStroke(){
        this.speed=15;
    }
    public void breastStroke(){
        this.speed=20;
    }
    public void freeStyle(){
        this.speed=25;
    }
    
    public void startSwimming(){}
    public void touch(){}   
}