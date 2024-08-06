public class ma {
    public static void main(String[] args) {
// recurssion
        // a function call itself
        // 5 4 3 2 1 solution recurssive code
        // debug through stack and recurssive tree
//printSeries(5);
//        int res=power(10, 3);
//        System.out.println(res);
        System.out.println("fact : "+ (fact(3)));

    }

    // public static void printSeries(int num){
//
//     if (num>1)
//         printSeries(num - 1);
//     System.out.println(num);
//// when function end it also returns automatically
//
//
// }
    // recursive
// power calculate
// base exp
//
    //n^p=  n * n^p-1
    // power finction using recurssion
//    public static int power(int base, int exponent) {
//        if (exponent > 0)// base condition
//            return base * power(base, exponent - 1);
//             return 1;
//
//    }
//  n! = n * n-1!;
//public static int fact(int n){
//       if (n>1){ // if n==0 || n==1 return n;
//           return n*fact(n-1);
//       }
//         return n;
//*
 public static int fact(int num ){
 if (num ==0|| num ==1)
    return 1;
       return num *fact(num-1);


 }
//
//
//
//
//
//
//
//
//
//
// *//













//

}



