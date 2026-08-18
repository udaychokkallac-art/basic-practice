public class Main {
    public static void main(String[] args) {
        Person person = new Person("Harry", "Potter");
        Student student = new Student("Chokkalla","Uday",7.91);

        student.showName();
        student.showGpa();
        person.showName();
        System.out.println(Integer.MAX_VALUE);
    }
}
