import java.util.*;
class complex{
    int real;
    int img;

complex(int r,int im){
    real = r;
    img = im;
}
static complex sum(complex c1, complex c2){
    complex c3 = new complex(0,0);
    c3.real = c1.real + c2.real;
    c3.img = c1.img + c2.img;
    return c3;
}
static complex diff(complex c1, complex c2){
    complex c3 = new complex(0,0);
    c3.real = c1.real - c2.real;
    c3.img= c1.img - c2.img;
    return c3;
}
static complex pro(complex c1, complex c2){
    complex c3 = new complex(0,0);
    c3.real = c1.real * c2.real - c1.img * c2.img;
    c3.img = c1.real * c2.img + c2.real * c1.img;
    return c3;
}
void print(){
    System.out.println(real + " "+img +"i");
}
}

public class firstQs {
    public static void main(String args[]){
        complex c1 = new complex(2,3);
        complex c2 = new complex(4,5);

        complex result1 = complex.sum(c1,c2);
        complex result2 = complex.diff(c1,c2);
        complex result3 = complex.pro(c1,c2);

        result1.print();
        result2.print();
        result3.print();
    }
    
}
