package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    GradeSystem gradeSystem;
    GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

        gradeSystem = new GradeSystemStub();
        gradeService = new GradeService(gradeSystem);
        double result = gradeService.calculateAverageGrades(18L);
        Assertions.assertEquals(50.0, result);
    }
}
