package Sesi7.PBONo2;

public class Outer {
    int number = 0;
    
    void outerMethod(){
        class Inner{
            public void print(){
                System.out.println("Mengakses Inner Class yang ke: " + (number++));
            }
        }
        
        Inner inner = new Inner();
        inner.print();
    }
}

class OuterAccess{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod();
        out.outerMethod();
        out.outerMethod();
    }
}
