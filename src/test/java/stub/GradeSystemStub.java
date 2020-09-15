package stub;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xqc
 * @Date: 2020/9/15 - 09 - 15 - 10:56
 * @Description: stub
 * @version: 1.0
 */
public class GradeSystemStub extends GradeSystem {

    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(70.0,30.0);
    }

}
