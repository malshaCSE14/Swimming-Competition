package swimmingcompetition1.entities;
import swimmingcompetition1.SwimmingUI.SUI;
public class Touchpad {
    private long finishingTime;
    private long timeTaken;
    public void calculateTime(long finishingTime,long startingTime){
        this.timeTaken=finishingTime-startingTime;
        
    }
    public void notifyFinishingTime(long finishingTime){
        
        this.finishingTime=finishingTime;
    }
    public void notityToScoreBoad(){
        ScoreBoard s = new ScoreBoard();
        s.notifyTime(timeTaken);
    }
    public void setStartingTime(long startingTime){
    }
    public long getTime(){
        return finishingTime-SUI.getStartTime();
    }
}
