package com.dac.spr;

import java.util.List;
import org.springframework.context.annotation.Scope;

@Scope(value = "prototype")
public class Triangle {
    List<Point> points;

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Triangle{" + "points=" + points + '}';
    }

}
