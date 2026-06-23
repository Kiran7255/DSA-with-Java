public class copyconstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name="kiran";
        s1.roll = 342;
        s1.password = "abcd";


        // copy constructor
        Student s2 = new Student(s1);
        s2.password = "xyz";

        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.password);

        System.out.println();

        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);


    }
}
    class Student{
        String name;
        int roll;
        String password;

        Student(){

        }

        Student(Student s1){
            this.name = s1.name;
            this.roll = s1.roll;

        }
    }
    
