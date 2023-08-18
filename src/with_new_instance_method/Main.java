package with_new_instance_method;
/*
this object is create using newInstance method belongs to java.lang.class..
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        //creating object using newInstance method of class Class..
//        Student s2 = (Student) Class.forName("with_new_instance_method.Student").newInstance();

        //2nd way
        Student s2 = Student.class.newInstance();

        //print the object ref to the console
        System.out.println(s2);

        //calling the student class property
        s2.colg_id = 202;
        System.out.println(s2.colg_id);
    }
}
