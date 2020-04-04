package chapter17;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class GoodsInfo {
    String code;
    String name;
    int price;

    public GoodsInfo() {
    }

    public GoodsInfo(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
}

class ClothingInfo extends GoodsInfo{
    String color;
    char size;
    public ClothingInfo(String name, String code, int price, String color, char size){
        super(name, code, price);
        this.color = color;
        this.size = size;
    }
}

class BookInfo extends GoodsInfo implements java.io.Serializable{
    String writer;
    int page;

    public BookInfo(String code, String name, int price, String writer, int page) {
        super(code, name, price);
        this.writer = writer;
        this.page = page;
    }

    private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeUTF(code);
        out.writeUTF(name);
        out.writeInt(price);
        /*out.writeUTF(writer);
        out.writeInt(page);*/
        out.defaultWriteObject();

    }
    private  void readObject(ObjectInputStream in) throws  IOException, ClassNotFoundException{
        code = in.readUTF();
        name = in.readUTF();
        price = in.readInt();
        /*writer = in.readUTF();
        page = in.readInt();*/
        in.defaultReadObject();

    }

}

class Rectangle implements java.io.Serializable{
    static final long serialVersionUID = 100;
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int getArea(){
        return  width * height;
    }
}