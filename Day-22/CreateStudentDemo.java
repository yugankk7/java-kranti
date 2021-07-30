package hibernate_prac;

//import hibernate_prac.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    
    public static void main(String[] args) {
        //CREATE SESSION

        SessionFactory factory = new Configuration().configure("hibernate_prac/src/hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class).buildSessionFactory();

        // GET SESSION

        Session session = factory.getCurrentSession();

        try {
            // create student object
            System.out.println("Creating student object...");
            Student tempStu1 = new Student("Steve", "Mark", "steve_mark@gmail.com");
            Student tempStu2 = new Student("Dave", "Grohl", "dave_grohl@gmail.com");
            Student tempStu3 = new Student("Ross", "Geller", "ross_geller@gmail.com");
            
            // start transaction
            session.beginTransaction();
            
            // save student object
            System.out.println("Saving the student");
            session.save(tempStu1);
            session.save(tempStu2);
            session.save(tempStu3);
            
            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            factory.close();
        }

    }

}
