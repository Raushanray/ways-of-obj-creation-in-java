package with_clone_method;

public class Student implements Cloneable{

    public  int colg_id = 101;

    public Student() {
        System.out.println("Student class constructor ");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
