public class School {

    private Teacher teacher;
    private Subject subject;

    public School() {
        subject= new Subject("Math");
        teacher = new Teacher(subject,"Sara");
    }

    public void getNameTeacher(){
        System.out.println(teacher.getName());
    }
    public void getNameSchool(){
        System.out.println(teacher.getSubject());
    }
}
