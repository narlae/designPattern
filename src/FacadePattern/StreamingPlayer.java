package FacadePattern;

public class StreamingPlayer {
    String playingMovie;

    public void on() {
        System.out.println("스트리밍 플레이어가 켜졌습니다.");
    }

    public void play(String movie) {
        System.out.println("스트리밍 플레이어에서 \"" + movie + "\"를 재생합니다.");
        this.playingMovie = movie;
    }

    public void stop() {
        System.out.println("스트리밍 플레이어에서 \"" + playingMovie + "\" 재생을 종료합니다.");
    }

    public void off() {
        System.out.println("스트리밍 플레이어가 꺼졌습니다.");
    }
}
