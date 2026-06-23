public class classandobjects{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);


        Student s1 = new Student();
        s1.setName("KIRAN");
        System.out.println(s1.name);

        s1.setroll_no(20);
        System.out.println(s1.roll_no);


        BankAccount myAcc = new BankAccount();
        myAcc.name="KiranKumari";
        // myAcc.setpass("abdkddk");

    }
}
    class Pen{
        String color;
        int tip;

        void setColor(String newColor){
            color = newColor;
        } 
        void setTip(int newTip){
            tip = newTip;
        }

    }

    class Student  {
        String name;
        int roll_no;

        void setName(String newname){
            name = newname;
        }
        void setroll_no(int newroll_no){
            roll_no=newroll_no;
        }    
    }

    class BankAccount  {
        public String name;
        private String pass;
        // default void setpass(String pwd){
        //     pass=pwd;
        // }
    
        
    }
    