package com.alevedoya;

import com.alevedoya.Area;
import com.alevedoya.exception.ExceptionMayorACero;

public class AreaRectangle extends Area {
    private final double side;

    public AreaRectangle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() throws ExceptionMayorACero {
        if (side< 0){
            throw new ExceptionMayorACero("El valor del lado debe ser mayor que cero");
        }
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        try {
            return "El área del rectángulo es " + this.calculateArea();
        } catch (ExceptionMayorACero e) {
            throw new RuntimeException(e);
        }
    }
}
