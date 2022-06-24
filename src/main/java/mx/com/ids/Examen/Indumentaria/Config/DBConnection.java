package mx.com.ids.Examen.Indumentaria.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection DBConnection;
    public Connection connect(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("Driver Success");          
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Driver not found" + cnfe);
        }        
        String url="jdbc:mysql://localhost:3306/db_indumentaria";        
        try{
          DBConnection=DriverManager.getConnection(url,"root","Curso123");
          //System.out.println("Database Connected");
        }
        catch(SQLException se){
          System.out.println("Database Not Found");
        }
        return DBConnection;       
        
    }
}
