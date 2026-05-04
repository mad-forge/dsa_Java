package OOPs;

public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default ctor(constructor)
    public Student(){
        System.out.println("Student Default Ctor Called...");
    }
    //Parameterised ctor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student Parameterised Ctor Called...");
    }

    // Methods // Behaviours
    public void study(){
        System.out.println(name + "Studying");
    }
    public void sleep(){
        System.out.println(name + "Sleeping");
    }
    public void bunk(){
        System.out.println(name + "Bunking");
    }
}


