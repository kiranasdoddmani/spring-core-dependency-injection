import java.lang.reflect.Field;
/*
  This Also an Example of RefelectiveAPI
    RefelectiveAPI Means Accessing The Private Class
     Using These DeclaredField.setAccessible(true);

 setAccessible(true) Which help to Accessing the PrivateClass

 getDeclaredField("Course"); This Line tells Go-to JavaClass and Find Course FieldName
 */
public class FieldIInjection {

public static void injectCourse(student Student,CourseName course) {
     try {
         Field DeclaredField=student.class.getDeclaredField("Course");
          DeclaredField.setAccessible(true);
          DeclaredField.set(Student,course);
     } catch (ReflectiveOperationException e) {
         e.printStackTrace();
     }
}
}

