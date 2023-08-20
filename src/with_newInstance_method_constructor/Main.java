package with_newInstance_method_constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
this object is create using newInstance method belongs to java.lang.reflect constructor..
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //creating object using newInstance method of constructor class..
        Constructor<Student> constr = Student.class.getConstructor();
        Student s3 = constr.newInstance();



        //print the object ref to the console
        System.out.println(s3);

        //calling the student class property
        s3.colg_id = 203;
        System.out.println(s3.colg_id);
    }
}
