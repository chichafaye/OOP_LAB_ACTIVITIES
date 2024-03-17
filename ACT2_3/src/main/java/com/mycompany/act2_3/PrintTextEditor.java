package com.mycompany.act2_3;

class PrintTextEditor extends TextEditor {
    public PrintTextEditor(String initialText) {
        super(initialText);
    }

    public void print() {
        System.out.println(getText());
    }
}
