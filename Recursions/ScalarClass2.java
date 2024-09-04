public class ScalarClass2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        display(arr, 0);
    }

    public static void display(int[] arr, int i){
        if(i == arr.length) return;

        System.out.println(arr[i]);
        display(arr, i+1);
    }
}
