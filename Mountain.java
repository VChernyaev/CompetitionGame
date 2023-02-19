package homeTasks.CompetitionGame;

public class Mountain {

    private final int height;

    public Mountain(int height) {
        this.height = height;
    }

    public boolean pass(CanClimb canClimb) {
        return canClimb.getClimb() >= height;

    }

}
