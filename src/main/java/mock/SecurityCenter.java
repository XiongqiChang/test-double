package mock;

public class SecurityCenter {

    MockDoorPanel mockDoorPanel = new MockDoorPanel();

    private final DoorPanel doorPanel;

    public SecurityCenter(DoorPanel doorPanel) {
        this.doorPanel = doorPanel;
    }

    public void switchOn() {
        mockDoorPanel.close();
    }


}
