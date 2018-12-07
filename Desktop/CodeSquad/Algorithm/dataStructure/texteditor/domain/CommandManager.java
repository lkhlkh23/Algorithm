package dataStructure.texteditor.domain;

import dataStructure.texteditor.view.ResultView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class CommandManager {

    private static Map<String, BiFunction<List<String>, Command, List<String>>> commandMapper = new HashMap<>();

    private CommandManager() { }

    static {
        commandMapper.put("DELETE_LINE", (list, command) -> {
            int deleteLine = Integer.parseInt(command.getOption());
            if(deleteLine < 0) {
                throw new IllegalArgumentException("더이상 지울 수 없습니다!");
            }
            list.remove(deleteLine);
            command.getCursor().setPosition(list.get(deleteLine - 1).length() - 1, deleteLine - 1);
            return list;
        });
        commandMapper.put("DELETE_ALL", (list, command) -> {
            list.clear();
            command.getCursor().setPosition(0, 0);
            return list;
        });
        commandMapper.put("DELETE_BACKSPACE", (list, command) -> {
            int indexY = command.getCursor().getY();
            int indexX = command.getCursor().getX();
            String line = list.get(indexY);
            list.set(indexY,
                    line.substring(0, indexX - Integer.parseInt(command.getOption()))
                            + line.substring(indexX + 1, line.length() - 1));
            command.getCursor().setPosition(indexX, indexY);
            return list;
        });
        commandMapper.put("CREATE", (list, command) -> {
           list.add(command.getOption());
           command.getCursor().newLine();
           return list;
        });
        commandMapper.put("PRINT", (list, command) -> {
            ResultView.printAll(list);
            return null;
        });
        commandMapper.put("UPDATE", (list, command) -> {
            int indexY = command.getCursor().getY();
            int indexX = command.getCursor().getX();
            String line = list.get(indexY);
            list.set(indexY,
                    line.substring(0, indexX) + command.getOption()
                            + line.substring(indexX + command.getOption().length()));
            command.getCursor().setPosition(indexX + command.getOption().length(), indexY);
            return list;
        });
    }

    public static List<String> doCommand(List<String> list, Command command) {
        return commandMapper.get(command.getCmd()).apply(list, command);
    }
}
