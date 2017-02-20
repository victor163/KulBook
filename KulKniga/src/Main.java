
class Main {

    public static void main(String args[]){
        String exit="выход";
        String a="назад";
        Book start=new Book();
        IOProcessor printScan=new IOProcessor();
        String s;


        do {
            System.out.println("Редактировать,просмотреть блюдо, добавить блюдо,удалить или содержание? (р/п/д/у/с)");
            printScan.scanner();
            s=printScan.s;
            if (printScan.s.equals("п")) {
                do {
                    System.out.print("Введите название блюда \n");
                    printScan.scanner();
                    start.print(printScan.s);
                } while (!a.equals(printScan.s));
            } else if (printScan.s.equals("р")) {
                do {
                    System.out.print("Введите название блюда \n");
                    printScan.scanner();
                    start.addition(printScan.s);
                } while (!a.equals(printScan.s));

            } else if (printScan.s.equals("д")) {
                System.out.println("Введите название нового блюда");
                start.newCollection(printScan.s);
            }
            else if(printScan.s.equals("с")){
                start.content();
            }
            else if(printScan.s.equals("у")){
                System.out.print("Введите название блюда \n");
                printScan.scanner();
                start.deleteCollection(printScan.s);
            }
        }while (!exit.equals(printScan.s));
    }

}