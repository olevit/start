package com.company.CanvasMouse;

public class Main {
    public static void main(String[] args){
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());//new BrushTool() return Brush icon
        //Draw a line
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
