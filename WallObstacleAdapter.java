package homeTasks.CompetitionGame;

public class WallObstacleAdapter implements Obstacle {

    private final Wall wall;

    public WallObstacleAdapter(Wall wall) {
        this.wall = wall;
    }

    @Override
    public boolean pass(Participian participian) {
        return wall.pass(participian);
    }
}
