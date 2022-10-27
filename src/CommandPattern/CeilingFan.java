package CommandPattern;

public class CeilingFan {

    String area;

    public CeilingFan(String area) {
        this.area = area;
    }

    public void on() {
        System.out.println(area+" 선풍기 속도가 HIGH로 설정되었습니다.");
    }

    public void off() {
        System.out.println(area+" 선풍기가 꺼졌습니다.");
    }
}
