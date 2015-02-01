package org.metastatic.guidplugin;

import com.intellij.openapi.editor.actionSystem.EditorAction;

/**
 * Created by cmarshall on 2/1/15.
 */
public class UUIDGeneratorAction extends EditorAction {
    public UUIDGeneratorAction() {
        super(new UUIDGeneratorHandler());
    }
}
