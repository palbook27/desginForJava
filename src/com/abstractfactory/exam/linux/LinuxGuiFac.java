package com.abstractfactory.exam.linux;

import com.abstractfactory.exam.gui.Button;
import com.abstractfactory.exam.gui.GuiFactory;
import com.abstractfactory.exam.gui.TextArea;

public class LinuxGuiFac implements GuiFactory {

    @Override
    public Button createButton() {
        //linux 관련된 버튼 native소스
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        //linux 관련된 텍스트에어리어어native소스
        return new LinuxTextArea();
    }
}
