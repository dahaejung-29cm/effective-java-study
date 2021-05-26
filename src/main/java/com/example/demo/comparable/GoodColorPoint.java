package com.example.demo.comparable;

public class GoodColorPoint implements Comparable<GoodColorPoint> {
    private Point point; //변수로 선언
    private Integer color;

    public GoodColorPoint(Point point, int color) {
        this.point = point;
        this.color = color;
    }

    //view method
    public Point asPoint() {
        return point;
    }

    @Override
    public int compareTo(GoodColorPoint colorPoint) {
        int result = point.compareTo(colorPoint.point); //멤버 변수가 객체를 참조하는 경우 
        if (result == 0) {
            return Integer.compare(color, colorPoint.color);
        }
        return result;
    }
}
