package com.dac.spr;

import org.springframework.context.annotation.Scope;

@Scope(value = "prototype")
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" + "pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + '}';
    }
    
    
}
