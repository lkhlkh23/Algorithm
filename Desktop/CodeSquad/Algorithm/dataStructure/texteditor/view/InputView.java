package dataStructure.texteditor.view;

import dataStructure.texteditor.domain.Command;
import dataStructure.texteditor.domain.CommandFactory;
import dataStructure.texteditor.domain.Cursor;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class InputView {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final String SPLIT_STANDARD = " ";

    public static Command obatinCommand(Cursor cursor) throws IOException {
        return CommandFactory.createCommand(cursor, br.readLine().split(SPLIT_STANDARD));
    }
}
