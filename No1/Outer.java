package Sesi7.PBONo1;

public class Outer {
    int number = 0;
    
    private class Inner{
        public void print(){
            System.out.println("Mengakses Inner Class yang ke: " + (++number));
        }
    }
    
    void displayFromMethod(){
        Inner in = new Inner();
        in.print();
    }
}

class Main{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.displayFromMethod();
        out.displayFromMethod();
    }
}
