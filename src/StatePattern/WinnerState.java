package StatePattern;

public class WinnerState implements State{

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려 주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 하나 더 받을 기회를 얻습니다.");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            System.out.println("추가 알맹이를 받았습니다.");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("더 이상 알맹이가 없습니다.");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
