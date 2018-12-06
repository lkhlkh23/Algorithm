package dataStructure.texteditor.view;

import dataStructure.texteditor.domain.Command;
import dataStructure.texteditor.domain.Cursor;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class InputView {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static Map<String, BiFunction<String, Cursor, Command>> commandMapper = new HashMap<>();

    static {
        commandMapper.put("CREATE", (option, cursor) -> new Command("CREATE", cursor, option));
        commandMapper.put("DELETE_ALL", (option, cursor) -> new Command("DELETE_ALL", cursor));
        commandMapper.put("DELETE_LINE", (option, cursor) -> new Command("DELETE_LINE", cursor, option));
        commandMapper.put("DELETE_BACKSPACE", (option, cursor) -> new Command("DELETE_BACKSPACE", cursor, option));
        commandMapper.put("PRINT", (option, cursor) -> new Command("PRINT", cursor));
    }

    public static Command obatinCommand(Cursor cursor) throws IOException {
        String[] input = br.readLine().split(" ");
        return commandMapper.get(input[0]).apply(input[1], cursor);
    }
}
