package darya;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MyConnection extends Thread 
{
     public static Connection getConnection()
     {
         Connection con = null;
         try
         {
            Class.forName("com.mysql.jdbc.Driver");
            String host = "jdbc:mysql://localhost:3306/darya"; 
            String uName = "root";
            String uPass = "";
            con = DriverManager.getConnection(host,uName,uPass);
            
         }
         catch(SQLException | ClassNotFoundException err)
         {
          JOptionPane.showMessageDialog(null, err.getMessage());
         }
             
         return con;
     }
       public static void main(String args[])
       {
        MyConnection t1=new MyConnection();
        t1.start();
        JOptionPane.showMessageDialog(null, "Thread is running.. \n Connection Established");
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        }
}

 
