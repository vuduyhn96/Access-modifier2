public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Name: " + student.getName());
        System.out.println("Classes: " + student.getClasses());

        student.setName("Alice");
        student.setClasses("C03");

        System.out.println("Name after modification: " + student.getName());
        System.out.println("Classes after modification: " + student.getClasses());
    }
}
