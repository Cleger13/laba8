public class Student extends People{
    Student(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);
    }

    @Override
    void walk(){
        System.out.println("Студент " + name + " не должна прогуливать пары");
    }
    void learn(){
        System.out.println(name + " посещает занятия");
    }
}
