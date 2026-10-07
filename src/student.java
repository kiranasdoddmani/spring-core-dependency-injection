public class student {
    private final int rollnum;
    private final String name;
    private CourseName Course;

    public student(int rollnum, String name, CourseName course) {
        this.rollnum = rollnum;
        this.name = name;
        this.Course = course;
    }

    public student(int rollnum, String name) {
        this.rollnum = rollnum;
        this.name = name;
    }

    public void setCourse(CourseName course) {
        this.Course = course;
    }

    public void ShowDetails(){
        System.out.println("Student rollNum:-"+rollnum);
        System.out.println("Student name:-"+name);

        if(Course==null){
            System.out.println("No Course is Assigned");
        }
       System.out.println("Assigned-Course-Name is:-"+Course.getCourseName());
        Course.Study();
    }
}
