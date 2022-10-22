package org.example;

import org.apache.commons.math3.util.Precision;

/**
 * двумерный класс точки.
 **/

public class Point3d extends Point2d {
    /**
     * координата Z
     **/
    private double zCoord;

    /**
     * Конструктор инициализации
     **/
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    /**
     * Конструктор по умолчанию.
     **/
    public Point3d() {
        this(0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    /**
     * Установка значения координаты Z.
     **/

    public void setZ(double val) {
        zCoord = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3d point3d)) return false;

        if (
                Double.compare(point3d.getX(), this.getX()) == 0 &&
                        Double.compare(point3d.getY(), this.getY()) == 0 &&
                        Double.compare(point3d.getZ(), this.getZ()) == 0) return true;
        return false;
    }

    /**
     * Расстояние между точками
     **/
    public double distanceTo(Point3d point) {
        return Precision.round(
                Math.sqrt(
                        Math.pow(point.getX() - this.getX(), 2) +
                                Math.pow(point.getY() - this.getY(), 2) +
                                Math.pow(point.getZ() - this.getZ(), 2)
                ), 2);
    }


}