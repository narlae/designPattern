package CommandPattern;

public class Stereo {

    String area;

    public Stereo(String area) {
        this.area = area;
    }

    public void on() {
        System.out.println(area+" 오디오가 켜졌습니다.");
    }

    public void off() {
        System.out.println(area+" 오디오가 꺼졌습니다.");
    }

    public void setCD() {
        System.out.println(area+" 오디오에서 CD가 재생됩니다.");
    }

    public void setDvd() {

    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        System.out.println(area+" 오디오의 볼륨이 "+volume+"로 설정되었습니다.");
    }
}
