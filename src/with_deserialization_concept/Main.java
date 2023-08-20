package with_deserialization_concept;
/*
you always remember that during the deserialization the JVM does not call your constructor.
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serialization
//        FileOutputStream fos = new FileOutputStream("text.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        Student s6 = new Student();
//        oos.writeObject(s6);

        /*
        few things to remember :

       To make your classes eligible for serialization make sure your classes implements serializable interface.
       To write serialize object to your file use writeObject and use readObject method during deserialization
       to get your object back.
       no constructor get called while we deserialize an object.
         */
        //deserialization
        FileInputStream fis = new FileInputStream("text.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // creating/ getting the student class object

       Student s7 =  (Student) ois.readObject();

       //printing to the cosole
        System.out.println(s7);

        //calling the student class property
        s7.colg_id = 800;
        System.out.println(s7.colg_id);
    }
}
