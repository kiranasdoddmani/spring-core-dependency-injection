public class main {
    static void main(String[] args) {
        // Constructor-Injection
        System.out.println("Constructor-Injection");
        CourseName spark=new SparkCourse();
        student sc=new student(101,"Amit",spark);
        sc.ShowDetails();
        System.out.println();


        // Setter-Injection
        System.out.println("Setter-Injection");
        CourseName bc=new BackendCourse();
        student sc2=new student(101,"Meera");
        sc2.setCourse(bc);
        sc2.ShowDetails();
        System.out.println();

        // Field-Injection
        System.out.println("Field-Injection");
        student sc3=new student(102,"Kabir");
        FieldIInjection.injectCourse(sc3,new SparkCourse());
        sc3.ShowDetails();
    }
}