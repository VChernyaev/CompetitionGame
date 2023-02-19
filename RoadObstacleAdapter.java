package homeTasks.CompetitionGame;

public class RoadObstacleAdapter implements Obstacle {

    private final Road road;

    public RoadObstacleAdapter(Road road) {
        this.road = road;
    }

    @Override
    public boolean pass(Participian participian) {
        return road.pass(participian);
    }
}
