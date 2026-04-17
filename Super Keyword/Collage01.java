
class College {
    String name = "ABC College";
}

class Student extends College {
    String name = "Rahul";

    void display() {
        System.out.println(super.name);
        System.out.println(name);
    }
}

public class Collage01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
