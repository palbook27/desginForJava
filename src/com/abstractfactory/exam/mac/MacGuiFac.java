package com.abstractfactory.exam.mac;

import com.abstractfactory.exam.gui.Button;
import com.abstractfactory.exam.gui.GuiFactory;
import com.abstractfactory.exam.gui.TextArea;

public class MacGuiFac implements GuiFactory {

    @Override
    public Button createButton() {
        //Mac 관련된 버튼 native소스
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        //Mac 관련된 텍스트에어리어어 native소스
        return new MacTextArea();
    }
}
