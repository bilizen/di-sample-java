public class Teacher {
    String name;
    Subject subject;

    public Teacher() {
        subject = new Subject("language");
        name = "Sara";
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject.name;
    }

}
