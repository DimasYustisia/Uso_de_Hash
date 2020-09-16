package app;
import seg.*;

public class App {

    public static void main(String[] args) {
        
        try {
            System.out.println(Cript.md5("meu texto de exemplo"));
            System.out.println(Cript.sha256("meu texto de exemplo"));
            System.out.println(Cript.sha512("meu texto de exemplo"));
        }catch (Exception e) {
            
        }
    }    
}
