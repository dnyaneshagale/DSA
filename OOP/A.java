import java.util.Scanner;

class Human{
    private int age = 19;
    private String name = "Dnyanesh";

    
    void getInfo(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Please Enter The Password : ");
        int asked = scn.nextInt();

        if(asked == 1234){
            System.out.println("For : \n1.Age\n2.Name");
            int n = scn.nextInt();
            switch (n) {
                case 1:
                    System.out.println("The Age of of the person is : " + age + "\n\nTo know the name of the person please enter 2");
                    int oi = scn.nextInt();
                    if(oi==2){
                        System.out.println("The name of the person is : " + name+"\n\n\n");
                    }else{
                        System.out.println("Invalid Input\n\n\n");
                    }
                    break;
                case 2: 
                    System.out.println("The name of the person is : " + name+ "\n\nTo know the Age of the person please enter 1");
                    int ani = scn.nextInt();
                    if(ani==1){
                        System.out.println("The Age of the person is : " + age+"\n\n\n");
                    }else{
                        System.out.println("Invalid Input\n\n\n");
                    }
                    break;
                default:
                    System.out.println("Invalid Input\n\n\n");
                    break;
            }
        }else{
            System.out.println("Wrong Password");
        }
    }
}


public class A {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.getInfo();
    }    
}