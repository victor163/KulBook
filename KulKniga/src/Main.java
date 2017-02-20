class Main {
    public static void main(String args[]){
        String exit="выход";
        Book start=new Book();
        IOProcessor printScan=new IOProcessor();
        do {
            printScan.print(1);
            printScan.read();
           switch (printScan.s){
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
        }while (!exit.equals(printScan.s));
    }
}