
import java.util.Collection;
import java.util.Scanner;

public class IOProcessor {
    String s;
    void printKeyValue(String key, Collection value){
        System.out.println(key+" "+value);
    }
    void printKey(String key){
        System.out.println(key);
    }
    void printValue(Collection value){
        System.out.println(value);
    }

     String scanner(){
        Scanner scan = new Scanner(System.in);
         s=scan.nextLine();
        return s;
    }





}
