import java.util.*;

public class August_7_2024 {
    class Human{
        private String[] namearr;
        private int[] agearr;

        public Human(int N){
            Scanner scn = new Scanner(System.in);
            namearr = new String[N];
            agearr = new int[N];

            for(int i = 0 ; i<N; i++){
                System.out.println("Enter Name of the Person " + (i+1) + " :");
                namearr[i]=scn.nextLine();
                System.out.println("Enter Age of The Person" + (i+1) + " :");
                agearr[i]=scn.nextInt();

                scn.nextLine(); // Consume the newline left-over
            }
        }
            public String[] getNameArr() {
                return namearr;
            }

            public int[] getAgeArr() {
                return agearr;
            }
    }
        void accessGetData(int N){
            Human obj = new Human(N);
            String[] names = obj.getNameArr();
            int[] ages = obj.getAgeArr();

            System.out.println("\nEntered Data:");
            for (int i = 0; i < N; i++) {
            System.out.print("[ " + names[i] + " : " + ages[i] +" ] " + " , ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number of People : ");
        int N = scn.nextInt();
        scn.nextLine(); // Consume the newline left-over

        August_7_2024 hello = new August_7_2024();
        hello.accessGetData(N);
        
    }
}