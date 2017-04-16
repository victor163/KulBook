
public class BookController {
    Book start=new Book();
    String s;
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
                case review:new IOProcessor("Введите название блюда\n");start.print();
                    break;
                case edit:new IOProcessor("Введите название блюда\n");start.addition();
                    break;
                case add:new IOProcessor("Введите название нового блюда\n");start.newCollection();
                    break;
                case delete:new IOProcessor("Введите название блюда\n");start.deleteCollection();
                    break;
                case content:start.content();
                    break;
            }
        }while (!exit.equals(x));
    }
}
