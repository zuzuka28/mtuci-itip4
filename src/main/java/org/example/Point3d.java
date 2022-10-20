package org.example;

import org.apache.commons.math3.util.Precision;

/**
 * двумерный класс точки.
 **/

public class Point3d {
    /**
     * координата X
     **/
    private double xCoord;
    /**
     * координата Y
     **/
    private double yCoord;
    /**
     * координата Z
     **/
    private double zCoord;

    /**
     * Конструктор инициализации
     **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    /**
     * Конструктор по умолчанию.
     **/
    public Point3d() {
        this(0, 0, 0);
    }

    /**
     * Сравнение двух объектов
     **/
    public static boolean compareWith(Point3d point1, Point3d point2) {
        return point1.getX() == point2.getX() && point1.getY() == point2.getY() && point1.getZ() == point2.getZ();
    }

    /**
     * Возвращение координаты X
     **/

    public double getX() {
        return xCoord;
    }

    /**
     * Возвращение координаты Y
     **/

    public double getY() {
        return yCoord;
    }

    /**
     * Возвращение координаты Y
     **/

    public double getZ() {
        return zCoord;
    }

    /**
     * Установка значения координаты X.
     **/

    public void setX(double val) {
        xCoord = val;
    }

    /**
     * Установка значения координаты Y.
     **/

    public void setY(double val) {
        yCoord = val;
    }

    /**
     * Установка значения координаты Z.
     **/

    public void setZ(double val) {
        zCoord = val;
    }

    /**
     * Сравнение двух объектов
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