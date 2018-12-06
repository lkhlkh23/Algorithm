package dataStructure.texteditor;

import dataStructure.texteditor.domain.Command;
import dataStructure.texteditor.domain.CommandManager;
import dataStructure.texteditor.domain.Cursor;
import dataStructure.texteditor.view.InputView;
import dataStructure.texteditor.view.ResultView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextEditor {

    public static void main(String[] args) throws IOException {
        Command command = null;
        Cursor cursor = Cursor.of();
        List<String> list = new ArrayList<>();

        while((command = InputView.obatinCommand(cursor)) != null) {
            CommandManager.doCommand(list, command);
        }
    }
}
