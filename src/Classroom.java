import java.util.ArrayList;

public class Classroom {
    private Teacher teacher;
    private Subject subject;

    public Classroom() {
        subject = new Subject("Math");
    }

    public String getNameTeacher() {
        return teacher.name;
    }

}
