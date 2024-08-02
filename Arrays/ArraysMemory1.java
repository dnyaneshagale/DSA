
//1.  Array is Non-Primitive : 1> Stack has Address Only
//                             2> Heap has Storage

//2.  Array of any size would be assigned at the same time with its address

public class ArraysMemory1 {
    public static void main(String[] args) {
        int[] one=new int[3];
        one [0]=10;
        one [1]=20;
        one [2] =30;

        int[] two = one;
        two[1]=200;

        for(int i=0; i<one.length; i++){
            System.out.println(one[i]);
        }
        //or 
        for(int i=0; i<two.length; i++){
            System.out.println(two[i]);
        }

        //As one & two are shallow copy of each other means changes in two
        // would affect one at the same time
    }
}
