package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        instrument = 0;
        PLAYING_COLOR = new Color(230, 158, 60);
    }

    @Override
    public boolean contains(Point point) {
        int point_x = point.x;
        int point_y = point.y;

        return containsX(point_x) && containsY(point_y);
    }

    @Override
    public void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    public void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }
}
