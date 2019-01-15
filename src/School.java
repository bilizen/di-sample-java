public class School {

    private String name;
    private Teacher teacher;

    public School() {
        name = "San Juan";
        teacher = new Teacher();
    }

    public void getNameTeacher(){
        System.out.println(teacher.getName());
    }
    public void getNameSchool(){
        System.out.println(teacher.getSubject());
    }
}
