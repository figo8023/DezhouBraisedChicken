package com.dezhou.braisedchicken.C27.Q3;


import java.util.Arrays;
import java.util.Comparator;

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Solution {
    public int largest(Point[] points) {
        Arrays.sort(points, new MyComparator());
        int result = 0;
        int[] longest = new int[points.length];
        for (int i = 0; i < longest.length; i++) {
            for (int j = 0; j < i; j++) {
                if (points[j].x < points[i].x && points[j].y < points[i].y) {
                    longest[i] = Math.max(longest[i], longest[j]);
                }
            }
            longest[i]++;
            result = Math.max(result, longest[i]);
        }
        return result == 1 ? 0 : result;
    }

    static class MyComparator implements Comparator<Point> {
        @Override
        public int compare(Point p1, Point p2) {
            if (p1.y < p2.y) {
                return -1;
            } else if (p1.y > p2.y) {
                return 1;
            } else if (p1.x < p2.x) {
                return -1;
            } else if (p1.x > p2.x) {
                return 1;
            }
            return 0;
        }
    }
}
