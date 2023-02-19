package homeTasks.CompetitionGame;

public class Cheater implements Participian {

    private final String name;

    public Cheater(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getJump() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getRun() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getSwim() {
        return Integer.MAX_VALUE;
    }

}
