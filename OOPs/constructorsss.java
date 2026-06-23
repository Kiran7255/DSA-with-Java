public class constructorsss {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("kiran");
        Student s3 = new Student(123);
    }   
}
 class Student {
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called..");
    }

    Student(String name){
        this.name = name;
        System.out.println("String constructor called:"+this.name);
    }
    Student(int roll) {
        this.roll = roll;
        System.out.println("Roll constructor called:"+this.roll);
    }
}
