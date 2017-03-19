package swimmingcompetition1.entities;
import java.util.ArrayList;
public class ScoreBoard {
    private ArrayList<Spectator> spct = new ArrayList<Spectator>();
    public static ArrayList<Winner> winnerArray = new ArrayList<Winner>();
    private long time;
    public ScoreBoard(){}
    public void notifyTime(long time){
        this.time=time;
    }
    public void attach(Spectator sp){
        spct.add(sp);
    }
    public void notifySP(boolean status){
        for (Spectator spct1 : spct) {
            spct1.update(status);
        }
    }

}
