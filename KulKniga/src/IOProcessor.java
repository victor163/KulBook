import java.util.Collection;
import java.util.Scanner;

public class IOProcessor {


    public void printKeyValue(String key, Collection value){
        System.out.println(key+" "+value);
    }
    public void printKey(String key){
        System.out.println(key);
    }
    public void printValue(Collection value){
        System.out.println(value);
    }
    public String read(String s){
        Scanner scan = new Scanner(System.in);
        s=scan.nextLine();
        return s;
    }
    IOProcessor(String a){
        System.out.print(a);
    }
}
