package homeTasks.CompetitionGame;

public class SwimObstacleAdapter implements Obstacle {

    private final SwimmingPool swim;

    public SwimObstacleAdapter(SwimmingPool swimmingPool) {
        this.swim = swimmingPool;
    }

    @Override
    public boolean pass(Participian participian) {
        return swim.pass(participian);
    }
}
