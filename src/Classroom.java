
public class Classroom {
    private Teacher teacher;
    private Subject subject;

    public Classroom() {
        subject= new Subject("Math");
        teacher = new Teacher(subject,"Sara");
    }

    public void getNameTeacher(){
        System.out.println("Name of the teacher: "+teacher.getName());
    }
    public void getNameSchool(){
        System.out.println("Name of the subject: "+teacher.getSubject());
    }

}
