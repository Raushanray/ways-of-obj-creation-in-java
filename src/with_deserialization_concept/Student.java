package with_deserialization_concept;

import java.io.Serializable;

public class Student implements Serializable {

    public  int colg_id = 101;

    public Student() {
        System.out.println("Student class constructor ");
    }
}
