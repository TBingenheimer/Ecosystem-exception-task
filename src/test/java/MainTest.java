import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
  StudentService studentService = new StudentService();
  @Test
    void findByIdTest(){
      try{
          studentService.findById("");
          fail();
      }catch(Exception e){
          //
      }
  }
}