import java.util.Arrays;

public class ma {
    public static void main(String[] args) {
      int [] arra  = new int[10]; //  dynamic array
        int [] arr ={40,60,100,10,80}; //  static array
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int index=0;
        for(int data : arr){
            System.out.println(data);
            index ++;

        }
        Arrays.sort(arr);
        System.out.println( Arrays.binarySearch(arr , 100));
        for(int data : arr){
            System.out.println(data);
        }



}

}



