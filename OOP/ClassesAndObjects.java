//Lecture 1

import java.util.*;

public class ClassesAndObjects{
    

    public static class person{
        String name;
        int age;

        void sahil1(){
            System.out.println( name + " of " + age + " is Studying ");
        }

        void sahil2(){
            System.out.println( name + " is Watching Netflix "); 
        }

        void sahil3(){
            System.out.println(name + " is Attending Lecture");
        }

        void sahil4(){
            System.out.println(name + " is at the Gym");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        person h1 = new person();
        h1.name = scn.nextLine();
        h1.age = 19;
        
        System.out.println("What " + h1.name + " is Doing ? \n1. Before Exam\n2. in weekend\n3. in college\n4. At 5 AM");
        int isd = scn.nextInt();


        if(isd == 1){
            h1.sahil1();
        }else if(isd == 2){
            h1.sahil2();
        }else if(isd == 3){
            h1.sahil3();
        }else if(isd == 4){
            h1.sahil4();
        }else{
            System.out.println("Invalid Input");
        }

        // String isd = scn.next(); 
        

        // if(isd == "before_exam"){
        //     h1.sahil1();
        // }else if(isd == "in weekend"){
        //     h1.sahil2();
        // }else if(isd == "in college"){
        //     h1.sahil3();
        // }else if(isd == "at 5 AM"){
        //     h1.sahil4();
        // }
    }
    
}