package chapter16;

public class NestedClassExample2 {
    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.addItem("쵸콜렛", 3, 1000);
        cart.addItem("케이크", 1, 25000);
        cart.addItem("샴페인", 1, 7000);
        Cart.Item item = cart.new Item("꽃다발", 1, 500000);
        cart.list.add(item);
        printCart(cart);

    }

    static void printCart(Cart cart){
        int num = cart.getItemNum();
        System.out.println("         상품명    수량    단가      금액");
        System.out.println("----------------------------------------");
        for(int i = 0; i < num; i++){
            Cart.Item item = cart.getItem(i);
            System.out.printf(" %3d  %5s  %5d  %7d  %7d  %n", i+1, item.name, item.num, item.unitPrice, item.getPrice());
        }
        System.out.println("----------------------------------------");
        System.out.printf(" 총계   %10d %n", cart.getTotalPrice());
    }
}
