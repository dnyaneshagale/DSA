import java.util.*;
import java.io.*;

public class ConstructorsAndThis {
    public static class Person{
        int age;
        String name;
        void saysHi(){
            System.out.println(name + "[ "+ age + " ] says hi !");
        }

        Person(){   //DEFAULT CONSTRUCTOR
            /* If we have created parametarized constructor then 
            Java won't give Default constructor
            */
            }

        Person(int age, String name){   //PARAMETARIZED CONSTRUCTOR
            this.age = age; //
            this.name = name;
        }
    }

        public static void main(String[] args) {
            Person p1 = new Person();
            p1.age = 19;
            p1.name = "A";
            p1.saysHi();

            Person p2 = new Person(19, "B");
            p2.saysHi();
        }
}
