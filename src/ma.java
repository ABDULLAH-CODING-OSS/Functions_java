public class ma {
    public static void main(String[] args) {
        System.out.println("hello");


       // print();
    }
//FUNCTIONS...
    // Acces Modifiers
    // public : everyone
    // private : only current class
    // default if nothing : accessible in defaulr package mean folder

   public static void print(){
        // callie
    System.out.println("messaage 1");
    print1();
}

    private static void print1() {
        System.out.println("message  2");
        print2();
    }

    private static void print2() {
        System.out.println("message 3");
    }

}
