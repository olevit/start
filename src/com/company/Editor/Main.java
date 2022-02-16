package com.company.Editor;

public class Main {
    public static void main(String[] args){
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());// return b
        //editor.restore(history.pop());// return a
        //editor.restore(history.pop());//error
        System.out.println(editor.getContent());
    }
}
