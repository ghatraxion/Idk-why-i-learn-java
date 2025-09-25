class person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hello, my name is " + name + " and i am " + age + " Years old.");
    }
}

public class h_oop {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name = "agha";
        p1.age = 14;
        p1.introduce();
    }
}
