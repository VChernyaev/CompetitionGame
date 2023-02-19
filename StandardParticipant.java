package homeTasks.CompetitionGame;

public class StandardParticipant implements Participian {

    private final String name;
    private final int jump;
    private final int run;
    private final int swim;

    public StandardParticipant(String name, int jump, int run, int swim) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getSwim() {
        return swim;
    }

}
