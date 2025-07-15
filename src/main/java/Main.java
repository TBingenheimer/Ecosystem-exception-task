import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);
        System.out.println("Student saved: " + savedStudent);

        try {
            Student lookedUp = studentService.findById("666");
        }catch(Exception e){
            System.out.println("Gesuchte*r Student*in ist geplatz.");
        }
    }
}
