package com.abstractfactory.exam.linux;

import com.abstractfactory.exam.gui.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "Linux TextArea";
    }
}
