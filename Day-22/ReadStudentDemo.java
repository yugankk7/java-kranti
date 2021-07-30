package hibernate_prac;

//import hibernate_prac.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
    
    public static void main(String[] args) {
        //CREATE SESSION

        SessionFactory factory = new Configuration().configure("hibernate_prac/src/hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class).buildSessionFactory();

        // GET SESSION

        Session session = factory.getCurrentSession();

        try {
            // create student object
            System.out.println("Creating student object...");
            Student tempStu = new Student("Tony", "Stark", "tony_stark@gmail.com");
         
            
            // start transaction
            session.beginTransaction();
            
            // save student object
            System.out.println("Saving the student");
            System.out.println(tempStu);
            session.save(tempStu);
        
            // commit transaction
            session.getTransaction().commit();


            //id of the student obj
            System.out.println("Saved student's id is " + tempStu.getId());


            //start new transacation by getting new session
            Session sess = factory.getCurrentSession();
            sess.beginTransaction();

            //get the student based on the id 
            System.out.println("\nGetting student with id " + tempStu.getId());

            Student myStu = sess.get(Student.class, 2);

            System.out.println("Get completed : " + myStu);

            //commit the transaction

            sess.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }

    }

}
