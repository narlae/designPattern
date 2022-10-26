package SingletonPattern;

public class Singleton { //DCL(Double-Checked Locking)
    private volatile static Singleton uniqueInstance;

    // 기타 인스턴스 변수

    private Singleton(){}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    //기타 메소드
}
