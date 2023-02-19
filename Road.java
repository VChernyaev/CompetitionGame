package homeTasks.CompetitionGame;

public class Road implements Obstacle {
    private final int distance;

    public Road(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean pass(Participian participian) {
        return participian.getRun() >= distance;

    }

}
