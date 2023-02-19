package homeTasks.CompetitionGame;

public class Cat implements Participian {

    private final String name;
    private final int jump;
    private final int run;

    public Cat(String name, int jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
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
        return -1;
    }

}
