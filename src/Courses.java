public class Courses {

    private String course;
    private String description;
    private double grade;

    public Courses() {
    }

    public Courses(String course, String description, double grade) {
        this.course = course;
        this.description = description;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String displayText() {
        String str = "";
        str += course + ": " + description + ", " + grade + "\n";
        return str;
    }

}
