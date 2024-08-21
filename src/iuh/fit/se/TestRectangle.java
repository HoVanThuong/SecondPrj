/*
 * @ Ho Van Thuong.java    1.0
 * Copyright (c)  IUH. All rights reserved
 *
 */

package iuh.fit.se;


/*
 * @description:
 * @author:
 * @date: 21/08/2024
 * @version: 1.0
 */

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        // in ra man hinh
        System.out.println("Chieu dai:" + r.getLength());
        System.out.println("Chieu rong:" + r.getWidth());
        System.out.println("Chu vi:" + r.getPerimeter());
        System.out.println("Dien tich:" + r.getArea());
    }
}
