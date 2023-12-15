public class laba_8 {
    public static void main(String[] args) {
        People people =  new People("Алина","Петрова",17);
        System.out.println(people);
        people.walk();
        people.run();
        people.voice();

        Student student = new Student("Анна","Томская",19);
        System.out.println(student);
        student.walk();
        student.learn();

        Teacher teacher = new Teacher("Олег","Васильев",36);
        System.out.println(teacher);
        teacher.voice();
        teacher.teach();
    }
}