public class copyconstructors {
    public static void main(String args[]){
        Student s1=new Student();

        s1.name="kiran";
        s1.roll_no=123;
        s1.password="abcd";

        s1.marks[0]=23;
        s1.marks[1]=56;
        s1.marks[2]=100;

        Student s2 = new Student(s1);
        s2.password="xyz";

        s1.marks[2]=190;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}
    class Student{
        String name;
        int roll_no ;
        String password;
        int marks[];

        //shallow copy constructor
        // Student(Student s1){
        //     marks = new int[3];

        //     this.name = s1.name;
        //     this.roll_no = s1.roll_no;
        //     this.marks = s1.marks;
        // }


        //deep copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll_no = s1.roll_no;
            for(int i=0; i<marks.length; i++){
                this.marks[i] = s1.marks[i];
            }
        }



        Student(){
            marks = new int[3];
            System.out.println("constructor is called..");
        }
        Student(String name){
            marks = new int[3];
            this.name = name;
        }

    }

