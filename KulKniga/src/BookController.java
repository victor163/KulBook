import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class BookController {
    Book start=new Book();
    IOProcessor printScan=new IOProcessor(null);
    String s;
    Map<String,Collection> bludo;
    final String review = "п";
    final String edit = "р";
    final String add = "д";
    final String delete = "у";
    final String content = "с";

    public void run(){
        IOProcessor printScan=new IOProcessor("");
        String exit="выход";
        String x;
        do{
            new IOProcessor("Редактировать,просмотреть блюдо, добавить блюдо,удалить или содержание? (р/п/д/у/с)\n");
            x=printScan.read(s);
            switch (x) {
                case review:new IOProcessor("Введите название блюда\n");print();
                    break;
                case edit:new IOProcessor("Введите название блюда\n");addition();
                    break;
                case add:new IOProcessor("Введите название нового блюда\n");newCollection();
                    break;
                case delete:new IOProcessor("Введите название блюда\n");deleteCollection();
                    break;
                case content:content();
                    break;
            }
        }while (!exit.equals(x));
    }

    public void print() {
        bludo=start.getBludo();
        String b=printScan.read(s);
        bludo.put("цезарь", start.cez());
        bludo.put("пицца", start.pizza());
        bludo.put("курица", start.chiken());
        bludo.put("бургер", start.burger());
        bludo.put("плов", start.plov());
        for (Map.Entry<String, Collection> entry : bludo.entrySet()) {
            if (b.equals(entry.getKey())) {
                printScan.printKeyValue(entry.getKey(),entry.getValue());
            }
        }return;
    }
    public void addition(){
        String ing;
        String b=printScan.read(s);
        bludo.put("цезарь", start.cez());
        bludo.put("пицца", start.pizza());
        bludo.put("курица", start.chiken());
        bludo.put("бургер", start.burger());
        bludo.put("плов", start.plov());
        for (Map.Entry<String, Collection> entry : bludo.entrySet()) {
            if (b.equals(entry.getKey())) {
                new IOProcessor("Введите ингредиент\n");
                ing=printScan.read(s);
                entry.getValue().add(ing);
                printScan.printValue(entry.getValue());
            }
        }
    }
    public void content() {
        bludo.put("цезарь", start.cez());
        bludo.put("пицца", start.pizza());
        bludo.put("курица", start.chiken());
        bludo.put("бургер", start.burger());
        bludo.put("плов", start.plov());
        for (Map.Entry<String, Collection> entry : bludo.entrySet()) {
            printScan.printKey(entry.getKey());
        }
    }
    public void newCollection() {
        String name;
        String b;
        name=printScan.read(s);
        String a="нет";
        Collection newBludo = new ArrayList();
        do {
            new IOProcessor("Введите ингредиент\n");
            b=printScan.read(s);
            newBludo.add(b);
            new IOProcessor("Добавть еще ингредиент?\n");
            b=printScan.read(s);
        } while (!a.equals(b));
        printScan.printKeyValue(name,newBludo);
    }
    public void deleteCollection(){
        String b=printScan.read(s);
        bludo.put("цезарь", start.cez());
        bludo.put("пицца", start.pizza());
        bludo.put("курица", start.chiken());
        bludo.put("бургер", start.burger());
        bludo.put("плов", start.plov());
        for (Map.Entry<String, Collection> entry : bludo.entrySet()){
            if (b.equals(entry.getKey())){
                entry.getValue().clear();
                printScan.printKeyValue(entry.getKey(),entry.getValue());
            }
        }

    }

}
