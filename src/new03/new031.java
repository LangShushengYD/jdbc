package new03;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class new031 {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/t2";
    private static final String USER="root";
    private static final String PASSWORD="sjk666666.";
    public static void main(String []args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery("select user_name,age from imooc_goddes");
        while(rs.next()) {
            System.out.println(rs.getString("user_name"+","+rs.getInt("age")));
        }
    }
}
