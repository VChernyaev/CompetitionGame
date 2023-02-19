package homeTasks.CompetitionGame;

public class SwimmingPool implements Obstacle {
    private final int distance;

    public SwimmingPool(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean pass(Participian participian) {
        return participian.getSwim() >= distance;

    }

}
