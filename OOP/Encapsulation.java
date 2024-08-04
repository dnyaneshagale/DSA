class Human{
     int age;       //Accessible only in this class
     String name;  //Accessible only in This Class

    public Human(){  //Constructor -> Same name as Class Name but as a Method.
                    //Everytime an object is Created it will call Constructor
        System.out.println("In Constructor");

        age = 19;
        name = "Dnyanesh";
    }


    void setAge(int age){
        this.age = age;  //'this' Keyword will Help to Assign values to the object which is caleed
    }

    int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        // obj1.setAge(19);
        // obj1.setName("Dnyanesh");

        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
