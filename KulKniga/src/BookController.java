
public class BookController {
    Book start=new Book();
    IOProcessor printScan=new IOProcessor();

   /* public void print(int i) {
        switch (i) {
            case 1:
                s="Редактировать,просмотреть блюдо, добавить блюдо,удалить или содержание? (р/п/д/у/с)";
                break;
            case 2:
                s="Введите название блюда";
                break;
            case 3:
                s="Введите название нового блюда";
                break;
            case 4:
                s="Введите ингредиент";
                break;
            case 5:
                s="Добавть еще ингредиент?";
                break;
        }
    }*/

    public void play(String s){


            switch (s) {
                case "п":printScan.print(2);start.print();
                    break;
                case "р":printScan.print(2);start.addition();
                    break;
                case "д":printScan.print(3);start.newCollection();
                    break;
                case "у":printScan.print(2);start.deleteCollection();
                    break;
                case "с":start.content();
                    break;


            }
    }

}
