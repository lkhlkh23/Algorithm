package dataStructure.texteditor.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class CommandFactory {
    private static Map<String, BiFunction<String, Cursor, Command>> commandMapper = new HashMap<>();

    static {
        commandMapper.put("CREATE", (option, cursor) -> new Command("CREATE", cursor, option));
        commandMapper.put("DELETE_ALL", (option, cursor) -> new Command("DELETE_ALL", cursor));
        commandMapper.put("DELETE_LINE", (option, cursor) -> new Command("DELETE_LINE", cursor, option));
        commandMapper.put("DELETE_BACKSPACE", (option, cursor) -> new Command("DELETE_BACKSPACE", cursor, option));
        commandMapper.put("PRINT", (option, cursor) -> new Command("PRINT", cursor));
        commandMapper.put("UPDATE", (option, cursor) -> new Command("UPDATE", cursor, option));
    }

    public static Command createCommand(Cursor cursor, String[] input) {
        if(input.length == 1) {
            return commandMapper.get(input[0]).apply("", cursor);
        }

        if(input.length == 4) {
            cursor.setPosition(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            return commandMapper.get(input[0]).apply(input[3], cursor);
        }

        return commandMapper.get(input[0]).apply(input[1], cursor);

    }
}
