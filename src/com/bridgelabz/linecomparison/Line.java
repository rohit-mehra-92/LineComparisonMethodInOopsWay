package com.bridgelabz.linecomparison;

import java.util.Objects;

public class Line {
    float length;
    Point p1;
    Point p2;

    float getLenght(){
        return (float) Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Float.compare(line.length, this.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

}



