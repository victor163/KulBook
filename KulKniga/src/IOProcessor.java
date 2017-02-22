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
        switch (i) {
            case 1:
                System.out.println("Редактировать,просмотреть блюдо, добавить блюдо,удалить или содержание? (р/п/д/у/с)");
                break;
            case 2:
                System.out.println("Введите название блюда");
                break;
            case 3:
                System.out.println("Введите название нового блюда");
                break;
            case 4:
                System.out.println("Введите ингредиент");
                break;
            case 5:
                System.out.println("Добавть еще ингредиент?");
                break;
        }
    }
}
