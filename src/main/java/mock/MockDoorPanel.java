package mock;

/**
 * @Author: xqc
 * @Date: 2020/9/15 - 09 - 15 - 10:33
 * @Description: mock
 * @version: 1.0
 */
public class MockDoorPanel extends DoorPanel {

    @Override
    public void close() {
        System.out.println("我被关了");;
    }
}
