package com.company.UIControl;

public class Main {
    public static void main(String[] args) {
        drawUIControl(new TextBox());// or new CheckBox
    }
    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
