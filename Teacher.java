public class Teacher extends People{
    Teacher(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);
    }

    @Override
    void voice(){
        System.out.println(name + " объясняет предмет классу ");
    }
    void teach(){
        System.out.println(name + " ведет урок ");
    }
}
