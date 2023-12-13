package com.abstractfactory.exam.mac;

import com.abstractfactory.exam.gui.TextArea;

public class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "Mac TextArea";
    }
}
