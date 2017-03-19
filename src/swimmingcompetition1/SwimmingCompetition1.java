/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimmingcompetition1;
import swimmingcompetition1.entities.Person;
import swimmingcompetition1.entities.MaleSwimmer;
import swimmingcompetition1.entities.SupportingStaff;
import swimmingcompetition1.entities.Judge;
import swimmingcompetition1.entities.FemaleSwimmer;
import swimmingcompetition1.entities.Swimmer;
import swimmingcompetition1.entities.Spectator;
import java.sql.DriverManager;
import swimmingcompetition1.SwimmingUI.*;
import java.util.ArrayList;
import swimmingcompetition1.entities.Winner;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
/**
 *
 * @author Student
 */
public class SwimmingCompetition1 {
public static ArrayList<Person> personList = new ArrayList<Person>();
public static ArrayList<MaleSwimmer> maleSwimList = new ArrayList<MaleSwimmer>();
public static ArrayList<FemaleSwimmer> femaleSwimList = new ArrayList<FemaleSwimmer>();  
public static ArrayList<Judge> judgeList = new ArrayList<Judge>();  
public static ArrayList<Spectator> spectList = new ArrayList<Spectator>();
public static ArrayList<SupportingStaff> staffList = new ArrayList<SupportingStaff>();
public static ArrayList<Swimmer> swimList = new ArrayList<Swimmer>();
//public static ArrayList<Winner> winnerList = new ArrayList<Winner>();
public static ArrayList<Swimmer> registeredList = new ArrayList<Swimmer>();
    
    public static void main(String[] args) {
        
        
        Competition comp = new Competition();
        comp.setVisible(true);
    }

}
