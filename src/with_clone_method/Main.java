package with_clone_method;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       /*
       create a student class object
        */
        //creating object using newInstance method of constructor class..
        Constructor<Student> cons1 = Student.class.getConstructor();
        Student  s3 = cons1.newInstance();

        System.out.println(s3);
        s3.colg_id = 500;
        System.out.println(s3.colg_id);

        System.out.println("========================================");

        /*
        few things to know about clone() method  in java: -

       object cloning  is a way to create an exact copy of an object
       You must implement java.lang.Cloneable interface to make your classes eligible for
       cloning.(implementing java cloneable interface) java clone method throws clonenotsupportedexception.
       the constructor doesn’t get called while we create an object by using java clone().
       java clone method exists in java.lang package (java.lang.Object)
         */
        with_clone_method.Student s4 = (Student)s3.clone();

        //print the object ref to the console
        System.out.println(s4);

        //calling the student class property
        s4.colg_id = 600;
        System.out.println(s4.colg_id);
    }
}
