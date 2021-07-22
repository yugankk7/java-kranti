//With postgres

import java.sql.Connection;
import java.sql.DriverManager;

class HibernatePrac {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/hb_student_tracker?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        try {
            System.out.println("Connecting to database" + jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection succesfull");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
