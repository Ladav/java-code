import java.sql.*; 
class JdbcDemo1 { 
    public static void main(String args[]) { 
        try {
             Class.forName("com.mysql.jdbc.Driver");
              Connection con =DriverManager.getConnection("Jdbc:mysql:/// demodb","root","");
               Statement stmt = con.createStatement();
                stmt.executeUpdate("create table list(id int, name varchar(20))");
                 String query = "create table list(id int, name varchar(20))";
                  stmt.executeUpdate(query);
                   } 
                   catch(Exception e)
                    {
                         System.out.println("Exception has occured "+e);
                    } 
    } 
}