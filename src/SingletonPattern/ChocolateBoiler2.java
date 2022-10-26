package SingletonPattern;

public enum ChocolateBoiler2 {
    UNIQUE_INSTANCE(true, false);
    private boolean empty;
    private boolean boiled;

    //private 기본값 생략
    ChocolateBoiler2(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("보일러에 우유와 초콜릿을 혼합한 재료를 넣음");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("끓인 재료를 다음 단계로 넘김");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("재료를 끓임");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
