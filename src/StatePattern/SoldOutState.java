package StatePattern;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("상품이 매진되었으니 동전을 넣지 마세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("상품이 매진되었습니다. 넣은 동전이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("상품이 매진되었습니다. 넣은 동전이 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("상품이 매진되었습니다. 넣은 동전이 없습니다.");
    }

    @Override
    public String toString() {
        return "매진";
    }
}
