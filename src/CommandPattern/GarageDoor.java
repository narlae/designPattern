package CommandPattern;

public class GarageDoor {

    String area;

    public GarageDoor(String area) {
        this.area = area;
    }

    public void up() {
        System.out.println("차고 문이 열렸습니다.");
    }
    public void down() {}
    public void stop() {}
    public void lightOn() {}
    public void lightOff() {}
}
