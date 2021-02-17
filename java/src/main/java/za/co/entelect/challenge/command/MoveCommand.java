package za.co.entelect.challenge.command;

public class MoveCommand implements Command {

    private final int x;
    private final int y;

    public MoveCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String render() {
        return String.format("move %d %d", x, y);
    }

//    @Override
//    public String toString() {
//        return "move " + x + " " + y;
//    }
}
