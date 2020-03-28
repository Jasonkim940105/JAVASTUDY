package chapter13;

import java.util.LinkedList;

public class LinkedListExercise {
    public static void main(String[] args) {

        LinkedList<Product> baguni = new LinkedList<>();
        baguni.add(new Product("111" , 10, 1000));
        baguni.add(new Product("222", 5, 2000));

        int toTalPrice = 0 ;
        toTalPrice = (baguni.get(0).num * baguni.get(0).price) +  (baguni.get(1).num * baguni.get(1).price);

        System.out.println(toTalPrice);


    }
}

class Product{
    public String code;
    public int num;
    public int price;

    public Product(String code, int num, int price) {
        this.code = code;
        this.num = num;
        this.price = price;
    }
}
