package homeTasks.CompetitionGame;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean pass(Participian participian) {
        return participian.getJump() >= height;

    }

}
