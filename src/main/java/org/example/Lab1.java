package org.example;

import org.apache.commons.math3.util.Precision;

import java.util.Objects;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] coords = line.split("\\s");
        double x1 = Double.parseDouble(coords[0]);
        double y1 = Double.parseDouble(coords[1]);
        double z1 = Double.parseDouble(coords[2]);
        Point3d p1 = new Point3d(x1, y1, z1);

        line = scanner.nextLine();
        coords = line.split("\\s");
        double x2 = Double.parseDouble(coords[0]);
        double y2 = Double.parseDouble(coords[1]);
        double z2 = Double.parseDouble(coords[2]);
        Point3d p2 = new Point3d(x2, y2, z2);

        line = scanner.nextLine();
        coords = line.split("\\s");
        double x3 = Double.parseDouble(coords[0]);
        double y3 = Double.parseDouble(coords[1]);
        double z3 = Double.parseDouble(coords[2]);
        Point3d p3 = new Point3d(x3, y3, z3);

        scanner.close();

        if (p1.equals(p2) && p1.equals(p3) && p2.equals(p3)) {
            System.out.println();
        } else {
            System.out.println(computeArea(p1, p2, p3));
        }
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double p = (point1.distanceTo(point2) + point2.distanceTo(point3) + point3.distanceTo(point1)) / 2;
        return Precision.round(Math.sqrt(p * (p - point1.distanceTo(point2)) * (p - point2.distanceTo(point3)) * (p - point3.distanceTo(point1))), 2);
    }

}
