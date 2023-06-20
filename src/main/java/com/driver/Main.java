package com.driver;

public class Main {


    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(4, 6));
        System.out.println(p.product(5, 7, 8));
        System.out.println(p.product(3.4, 2.2));
    }

}
class Product{
    //        Product(){
//
//        }
    public int product(int x, int y)
    {
        return x*y;
    }
    public int product(int x, int y, int z) {
        return x*y*z;
    }
    public double product(double x, double y)
    {
        return x*y;
    }
}
