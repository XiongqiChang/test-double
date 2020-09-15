package mockito;



import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.mockito.Mockito.*;


public class SecurityCenterTestByMockito {

    @BeforeEach
    public void setUp() {

    }
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    @Test
    public void shouldVerifyDoorIsClosed() {

        DoorPanel doorPanel = mock(DoorPanel.class);
        SecurityCenter securityCenter = new SecurityCenter(doorPanel);
        System.out.println(doorPanel);
        securityCenter.switchOn();
        verify(doorPanel, times(1)).close();

    }
}
