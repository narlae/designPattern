package SingletonPattern;

public enum Singleton2 {
    UNIQUE_INSTANCE;
}
class SingletonClient{
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.UNIQUE_INSTANCE;
        //여기서 싱글톤 사용

        ChocolateBoiler2 boiler = ChocolateBoiler2.UNIQUE_INSTANCE;
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance



    }

    /**
     * enum : 상수만 모아놓은 클래스, 메소드 생성자를 모두 가질 수 있음
     *        고정된 상수들의 집합으로써 런타임이 아닌 컴파일타임에 모든 값을 알고 있어야 한다. 즉 생성자가 private
     *
     *        enum을 이요한 싱글톤의 장점
     *        1. 간단하다, thread safe이다.
     *        2. Serialization을 스스로 해결
     *        3. Reflection을 통한 공격에도 안전
     */
}
