package swimmingcompetition1.Model;
import swimmingcompetition1.entities.MaleSwimmer;
import swimmingcompetition1.entities.SupportingStaff;
import swimmingcompetition1.entities.FemaleSwimmer;
import swimmingcompetition1.entities.Judge;
import swimmingcompetition1.entities.Spectator;
import swimmingcompetition1.SwimmingCompetition1;
import static swimmingcompetition1.SwimmingCompetition1.*;

public class CreateObject {
    public static void createJudge(String id, String name){
        Judge newJu = new Judge();
        newJu.setId(id);
        newJu.setName(name);
        personList.add(newJu);
        judgeList.add(newJu);
    }
    public static void createMaleSwimmer(String id, String name){
        MaleSwimmer newMS = new MaleSwimmer();
            newMS.setId(id);
            newMS.setName(name);
            personList.add(newMS);
            registeredList.add(newMS);
            maleSwimList.add(newMS);
    }
    public static void createFemaleSwimmer(String id, String name){
        FemaleSwimmer newFS = new FemaleSwimmer();
            newFS.setName(name);
            newFS.setId(id);
            SwimmingCompetition1.personList.add(newFS);
            SwimmingCompetition1.registeredList.add(newFS);
            SwimmingCompetition1.femaleSwimList.add(newFS);
    }
    public static void createSupportingStaff(String id, String name){
        SupportingStaff sup = new SupportingStaff();
        sup.setId(id);
        sup.setName(name);
        staffList.add(sup);
        personList.add(sup);
    }
    public static void createSpectator(String id, String name){
        Spectator sp = new Spectator();
        sp.setId(id);
        sp.setName(name);
        personList.add(sp);
        spectList.add(sp);
    }
}