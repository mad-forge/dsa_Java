package OOPs;

public class App {
    public static void main(String[] args) {
        //Parameterised constructor call

        Student A = new Student(1, "Rahul", 21);
        System.out.println("Student name is" + A.name);

        A.study();
        A.bunk();

        System.out.println("------------------");

        //Copy constructor call

        Student B = new Student(A);
        System.out.println("Student B name is" + B.name);

    }
}
