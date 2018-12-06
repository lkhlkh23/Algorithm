package dataStructure.texteditor.domain;

public class Command {
    private String cmd;
    private Cursor cursor;
    private String option;

    public Command(String cmd, Cursor cursor) {
        this.cmd = cmd;
        this.cursor = cursor;
    }

    public Command(String cmd, Cursor cursor, String option) {
        this(cmd, cursor);
        this.option = option;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Command{" +
                "cmd='" + cmd + '\'' +
                ", cursor=" + cursor +
                ", option='" + option + '\'' +
                '}';
    }
}
