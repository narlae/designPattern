package FacadePattern;

public class TheaterLights {
    public void dim(int i) {
        System.out.println("조명 밝기를 "+i+"%로 설정합니다.");
    }

    public void on() {
        System.out.println("조명이 켜졌습니다.");
    }
}
