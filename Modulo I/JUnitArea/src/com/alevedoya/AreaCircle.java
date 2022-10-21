package com.alevedoya;

import com.alevedoya.exception.ExceptionMayorACero;

public class AreaCircle extends Area {
    private final double radius;

    public AreaCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() throws ExceptionMayorACero {
        if (radius < 0) {
            throw  new ExceptionMayorACero("El valor del radio debe ser mayor que cero");
        }
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        try {
            return "El área del círculo es " + this.calculateArea();
        } catch (ExceptionMayorACero e) {
            throw new RuntimeException(e);
        }

    }
}

