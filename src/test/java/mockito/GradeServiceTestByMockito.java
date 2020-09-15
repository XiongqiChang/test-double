package mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class GradeServiceTestByMockito {

    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

        GradeSystem gradeSystem =  mock(GradeSystem.class);
        GradeService gradeService = new GradeService(gradeSystem);
        List<Double> doubleList = Arrays.asList(50.0, 50.0, 50.0);
        when(gradeSystem.gradesFor(1)).thenReturn(doubleList);
        Assertions.assertEquals(50.0, gradeService.calculateAverageGrades(1));

    }
}
