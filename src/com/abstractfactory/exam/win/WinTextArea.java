package com.abstractfactory.exam.win;

import com.abstractfactory.exam.gui.TextArea;

public class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "Win TextArea";
    }
}
