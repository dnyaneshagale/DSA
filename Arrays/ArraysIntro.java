public class ArraysIntro {
    public static void main(String[] args) {
        int[] arr;        //Declaring Array
        arr = new int[5]; //Assigned N number of Qty

        arr[0] =33; //Assigned Values 
        arr[1]=47;
        arr[2]=59;
        arr[3]=67;
        arr[4]=98;

        System.out.println(arr.length); //To know length of Array

        for(int i =0; i<arr.length; i++){ //Printing Array
            System.out.println(arr[i]);
        }
    }
}
