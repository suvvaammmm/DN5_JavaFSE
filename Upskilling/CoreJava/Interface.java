package Upskilling.CoreJava;

interface Play {
    void display();
}

class Guitar implements Play{
    public void display(){
        System.out.println("Playing Guitar");
    }
}

class Piano implements Play{
    public void display(){
        System.out.println("Playing Piano");
    }
}

public class Interface {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        guitar.display();
        piano.display();
    }    
}
