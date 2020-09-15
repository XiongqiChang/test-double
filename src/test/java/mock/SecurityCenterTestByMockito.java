package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static com.sun.javaws.JnlpxArgs.verify;


public class SecurityCenterTestByMockito {


    @Mock
    private DoorPanel doorPanel;

    @InjectMocks
    private SecurityCenter securityCenter;


    @BeforeEach
    public void setUp() {

    }
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */


    @Test
    public void shouldVerifyDoorIsClosed() {
         securityCenter.switchOn();

    }
}
