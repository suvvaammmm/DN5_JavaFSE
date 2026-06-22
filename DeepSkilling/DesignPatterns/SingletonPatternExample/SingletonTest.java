

public class SingletonTest {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger logger2 = logger.getInstance();
        
        logger1.log("First Message");
        logger2.log("Second Message");

        System.out.println("logger1 hashcode : "+logger1.hashCode());
        System.out.println("logger2 hashcode : "+logger2.hashCode());

        if(logger1 == logger2){
            System.out.println("Only one Logger instance exists.");
        } else{
            System.out.println("Multiple instances exists.");
        }
    }
}
