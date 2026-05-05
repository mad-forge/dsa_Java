package OOPs;

public class Student {
    //Properties:
    int id;
    String name;
    int age;

    //CONSTRUCTORS
    //---->Constructor A (Default constructor)
    public Student(){
        System.out.println("Without any details new student admission");
    }

    //---->Constructor B (Parametrised constructor)
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println(name + "got admission");
    }

    //----Constructor C (Copy constructor)
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
        System.out.println(name + "Copy of 1st student");
    }

    //METHODS (Actions)

    public void study(){
        System.out.println(name + "is studying");
    }

    public void bunk(){
        System.out.println(name + "is bunking");
    }
}


