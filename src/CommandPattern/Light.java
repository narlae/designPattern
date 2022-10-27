package CommandPattern;

public class Light {

    private String area;

    public Light(String area) {
        this.area = area;
    }

    public void on() {
        System.out.println(area + " 조명이 켜졌습니다.");
    }

    public void off() {
        System.out.println(area + " 조명이 꺼졌습니다.");
    }
}
