package homeTasks.CompetitionGame;

public class MountainObstacleAdapter implements Obstacle {

    private final Mountain mountain;

    public MountainObstacleAdapter(Mountain mountain) {
        this.mountain = mountain;
    }

    @Override
    public boolean pass(Participian participian) {
        return mountain.pass(participian);
    }
}
