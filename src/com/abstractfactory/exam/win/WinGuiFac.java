package com.abstractfactory.exam.win;

import com.abstractfactory.exam.gui.Button;
import com.abstractfactory.exam.gui.GuiFactory;
import com.abstractfactory.exam.gui.TextArea;

public class WinGuiFac implements GuiFactory {

    @Override
    public Button createButton() {
        //linux 관련된 버튼 native소스
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        //linux 관련된 텍스트에어리어어native소스
        return new WinTextArea();
    }
}
