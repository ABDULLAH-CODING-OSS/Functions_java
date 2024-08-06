public class ma {
    public static void main(String[] args) {
        System.out.println("hello");

       printNumber(5);
        printNumber(6.5);
        int [] newArr={10,20,30,4,50,};
        int res=sumOfArray(newArr);
        System.out.println(res);
       // print();
        // Array non primitive & reference data structure
    }
    static int sumOfArray(int [] arr){ // pass by refernece
int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
        }
        return sum;
    }

    private static void printNumber(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(j+1);
        }
    }
    private static void printNumber(double i) {

    }

    //FUNCTIONS...
    // Acces Modifiers
    // public : everyone
    // private : only current class
    // default if nothing : accessible in defaulr package mean folder
// Functioon call by value
    // print 1 to 5
    // pass by refernece
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
// function overloading
    // same return type
    //same name
    // diff arguments
    // void abc(int n){}
    // void abc(int n1, int n2){}
    // sequence of parameter/arguments
    // void abc (int n , double b);
    // void abc (double b , int n);

}
