public class Teacher {
    String name;
    Subject subject;

    public Teacher( Subject subject,String name) {
        this.subject= subject;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject.name;
    }

}
