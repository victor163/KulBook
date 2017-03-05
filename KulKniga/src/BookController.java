
public class BookController {
    Book start=new Book();
    String s;
    final String review = "п";
    final String edit = "р";
    final String add = "д";
    final String delete = "у";
    final String content = "с";

    public void run(){
        IOProcessor printScan=new IOProcessor();
        String exit="выход";
        String x;
        do{
            printScan.print(1);
            x=printScan.read(s);
            switch (x) {
                case review:printScan.print(2);start.print();
                    break;
                case edit:printScan.print(2);start.addition();
                    break;
                case add:printScan.print(3);start.newCollection();
                    break;
                case delete:printScan.print(2);start.deleteCollection();
                    break;
                case content:start.content();
                    break;
            }
        }while (!exit.equals(x));
    }

    BookController(int x){
        switch (x){
            case 1:
                this.s="Редактировать,просмотреть блюдо, добавить блюдо,удалить или содержание? (р/п/д/у/с)";
                break;
            case 2:
                this.s="Введите название блюда";
                break;
            case 3:
                this.s="Введите название нового блюда";
                break;
            case 4:
                this.s="Введите ингредиент";
                break;
            case 5:
                this.s="Добавть еще ингредиент?";
                break;
        }

    }
}
