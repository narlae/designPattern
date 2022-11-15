package StatePattern;

public class NoQuarterState implements State{
    transient GumballMachine gumballMachine;
    private static final long serialVersionUID = 2L;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void refill() {
        System.out.println("아직 알맹이가 차있습니다.");
    }

    @Override
    public String toString() {
        return "동전 투입 대기중";
    }
}
