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



    public void print(int i){
        BookController b=new BookController(i);
        System.out.println(b.s);
    }
}
