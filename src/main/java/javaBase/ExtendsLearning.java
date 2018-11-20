package javaBase;

public class ExtendsLearning {

    public static class Fruit {
        protected Fruit(){
            System.out.println("Fruit showtime!");
        }
        int weight;
        double price;
        public void test() {

        }
        public static void test1() {

        }
    }

    public static class Apple extends Fruit{

        public Apple() {
            System.out.println("Apple showtime!");
        }
        public void test() {
            super.test();
            Fruit.test1();
        }

    }

    public static void main(String[] args) {
        Apple apple = new Apple();

    }

}
