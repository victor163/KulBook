import java.util.*;

public class Book{
    IOProcessor printScan=new IOProcessor();
    private String b;
    private String s=null;
    private Map<String, Collection> bludo = new HashMap<>();

    public  Collection cez(){
        Collection co1=new ArrayList();
        co1.add("салат 500г");
        co1.add("курица 300г");
        co1.add("сухари 100г");
        co1.add("соус цезарь 150г");
        return co1;
    }
    public  Collection pizza() {
        Collection co1=new ArrayList();
        co1.add("тесто 200г");
        co1.add("курица 300г");
        co1.add("сыр 50г");
        co1.add("соус 50г");
        co1.add("грибы 20г");
        return co1;
    }
    public  Collection chiken(){
        Collection co1=new ArrayList();
        co1.add("курица 1шт");
        co1.add("специи(по вкусу)");
        co1.add("соль 5г");
        return co1;
    }
    public  Collection burger(){
        Collection co1=new ArrayList();
        co1.add("булка для бургера 1шт");
        co1.add("котлета для бургера 1шт");
        co1.add("сыр 2шт");
        co1.add("соус 5гр");
        co1.add("помидор 5гр");
        co1.add("салат 5гр");
        return co1;
    }
    public  Collection plov(){
        Collection co1=new ArrayList();
        co1.add("рис 500г");
        co1.add("курица 300г/мясо 300г");
        co1.add("морковь 100г");
        co1.add("лук 50г");
        return co1;
    }

    public void print() {
        b=printScan.read(s);
        bludo.put("цезарь", cez());
        bludo.put("пицца", pizza());
        bludo.put("курица", chiken());
        bludo.put("бургер", burger());
        bludo.put("плов", plov());
        for (Map.Entry<String, Collection> entry : bludo.entrySet()) {
            if (b.equals(entry.getKey())) {
                printScan.printKeyValue(entry.getKey(),entry.getValue());
            }
        }return;
    }
    public void addition(){
        String ing;
        b=printScan.read(s);
        bludo.put("цезарь", cez());
        bludo.put("пицца", pizza());
        bludo.put("курица", chiken());
        bludo.put("бургер", burger());
        bludo.put("плов", plov());
        for (Map.Entry<String, Collection> entry : bludo.entrySet()) {
            if (b.equals(entry.getKey())) {
                printScan.print(4);
                ing=printScan.read(s);
                entry.getValue().add(ing);
                printScan.printValue(entry.getValue());
            }
        }
    }
    public void content() {
        bludo.put("цезарь", cez());
        bludo.put("пицца", pizza());
        bludo.put("курица", chiken());
        bludo.put("бургер", burger());
        bludo.put("плов", plov());
        for (Map.Entry<String, Collection> entry : bludo.entrySet()) {
            printScan.printKey(entry.getKey());
        }
    }
    public void newCollection() {
        String name;
        name=printScan.read(s);
        String a="нет";
        Collection newBludo = new ArrayList();
        do {
            printScan.print(4);
            b=printScan.read(s);
            newBludo.add(b);
            printScan.print(5);
            b=printScan.read(s);
        } while (!a.equals(b));
                printScan.printKeyValue(name,newBludo);
            }
    public void deleteCollection(){
        b=printScan.read(s);
        bludo.put("цезарь", cez());
        bludo.put("пицца", pizza());
        bludo.put("курица", chiken());
        bludo.put("бургер", burger());
        bludo.put("плов", plov());
        for (Map.Entry<String, Collection> entry : bludo.entrySet()){
            if (b.equals(entry.getKey())){
                entry.getValue().clear();
                printScan.printKeyValue(entry.getKey(),entry.getValue());
            }
        }

    }
}



