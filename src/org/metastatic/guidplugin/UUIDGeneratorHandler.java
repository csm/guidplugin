package org.metastatic.guidplugin;

import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.actionSystem.EditorWriteActionHandler;

import java.util.UUID;

/**
 * Created by cmarshall on 2/1/15.
 */
public class UUIDGeneratorHandler extends EditorWriteActionHandler {
    @Override
    public void executeWriteAction(Editor editor, Caret caret, DataContext dataContext) {
        if (editor != null) {
            CaretModel caretModel = editor.getCaretModel();
            int position = caretModel.getOffset();
            Document doc = editor.getDocument();
            if (doc.isWritable()) {
                String uuidString = UUID.randomUUID().toString();
                doc.insertString(position, uuidString);
                caretModel.moveCaretRelatively(uuidString.length(), 0, false, false, false);
            }
        }
    }
}
