import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }
    public Student findById(String id) throws Exception {
        Student student=repo.findStudentById(id);
        if(student!=null){
            return student;
        }else{
            throw new Exception("Student not found");
        }
    }
    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }
}
