class Main {
    public static void main(String args[]){
        String exit="выход";
        IOProcessor printScan=new IOProcessor();
        BookController controller=new BookController();
        String s=null;
        String x;

        do {
            printScan.print(1);
            x=printScan.read(s);
            controller.play(x);
        }while (!exit.equals(x));


    }
}