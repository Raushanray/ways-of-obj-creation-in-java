package with_new_keyword;

public class Main {
    public static void main(String[] args) {
        //creating object by new keyword
        Student s1 = new Student();
        //printing the objcet of reference
        System.out.println(s1);
        //calling student class properties
        s1.colg_id = 102;
        System.out.println(s1.colg_id);
    }
}
