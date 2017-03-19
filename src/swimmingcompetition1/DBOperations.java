package swimmingcompetition1;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import swimmingcompetition1.entities.Winner;

public class DBOperations {
    String url = "jdbc:mysql://localhost:3306/swimmer";
        String username = "root";
        String password = "";
        Connection con = null;
        PreparedStatement pst = null;
        public void addWinner(ArrayList<Winner> w){
            try{
                con = (Connection)DriverManager.getConnection(url,username,password);
                String query = "INSERT INTO swimmerdetails VALUES (?,?,?,?,?,?)";
                pst = (PreparedStatement)con.prepareStatement(query);
                pst.setString(1,"0");
                int size = w.size();
                for(int i=0; i<size;i++){
                    pst.setString(i+2, w.get(i).getName());
                }
                for(int j=size;j<5;j++){
                    pst.setString(j+2, " ");
                }
          
                pst.executeUpdate();
            }catch(Exception e){
                System.out.println("Errorin DBOperations");
            }finally{
                if(pst!=null){
                    try {
                        pst.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (con!=null){
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
}
