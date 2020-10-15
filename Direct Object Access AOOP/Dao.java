
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Dao {

     Connection con = null;
     public void Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testaccount", "root", "");

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
      public int insert(Accounts a) 
    {
        Connection();
        int result = 0;
        try {
            String qry = "insert into Accounts  values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setInt(1, a.getTid());
            ps.setString(2, a.getdate());
            ps.setString(3, a.getTfselected());
            ps.setInt(4, a.getTamount());
            ps.setInt(5, a.getAccountno());
            ps.setString(6, a.getTfserved());
            result = ps.executeUpdate();

        } 
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
        return result;
    }
      public int update(Accounts a) {
          try{
            Connection();
            String qry="update accounts set date =?, type = ?, amount = ?, Accountno = ?, served_by = ?,  where Id = ? ";
            PreparedStatement ps = con.prepareStatement(qry);
          
            ps.setString(1, a.getdate());
             ps.setString(2, a.getTfselected());
            ps.setInt(3, a.getTamount());
            ps.setInt(4, a.getAccountno());
            ps.setString(5, a.getTfserved());
            ps.setInt(6, a.getTid());
            ps.executeUpdate();
           
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return 0;
    }
        
      
      public int delete(Accounts a)
      {
      try{
            Connection();
            String qry="delete from accounts where ID = ?";
            PreparedStatement ps = con.prepareStatement(qry);
             ps.setInt(1, a.getTid());
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return 0;
    } 
      
      

    ResultSet Selectall() 
    {
        Connection();
        ResultSet rs = null;
        try {
            String qry = "Select * from accounts ";
            Statement st = con.createStatement();
            rs = st.executeQuery(qry);
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.toString());
        }
        return rs;
    }

    ResultSet SelectbyID(Accounts a) {
        ResultSet rs = null;
        return rs;
    }
    
}
