package com.example.demo.comparable;

public class ColorPoint extends Point implements Comparable<Point> {

    private Integer color;

    public ColorPoint(Integer x, Integer y, Integer color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public int compareTo(Point point) {
        int result = super.compareTo(point);
        if (result == 0) {
            return Integer.compare(color, ((ColorPoint) point).color); // 잘못된 구현
        }
        return result;
    }
}
