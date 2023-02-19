package homeTasks.CompetitionGame;

public class SwimmingPool {

    private final int distance;

    public SwimmingPool(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanSwim canSwim) {
        return canSwim.getSwim() >= distance;

    }

}
