package model;

import java.util.ArrayList;
import java.util.List;

public class Shopy {
    private Cart cart;
    private List<Product> productList;

    public Shopy() {
        this.productList = new ArrayList<>();
        this.productList.add(new Dress("s","kırmızı elbise","1",10.2d));
        this.productList.add(new Dress("m","mavi elbise","1",10.2d));
        this.productList.add(new Dress("l","mor elbise","1",10.2d));
        this.productList.add(new Jean("31", "32","mavi kot pantolon","2",89.99d));
        this.productList.add(new Jean("31", "33","gri kot pantolon","2",89.99d));
        this.productList.add(new Jean("30", "30","siyah kot pantolon","2",89.99d));
        this.cart=new Cart();

    }


    public static void main(String[] args) {
        Shopy shopy=new Shopy();shopy.urunListeleme();
        shopy.getCart().addToCart(shopy.getProductList().get(0),2 );
        shopy.showCart();
        shopy.getCart().addToCart(shopy.getProductList().get(4),2 );
        shopy.showCart();

    }
    public void showCart(){
        for(CartEntry e:this.getCart().getEntryList()){
            System.out.println("ürün adı:"+e.getProduct().getName()+" adet:"+e.getQty()+" fiyat:"+e.getTotalAmount());
        }
        System.out.println("Sepet:"+this.getCart().getTotalAmount());
        System.out.println("*********************************");
    }
    public void urunListeleme(){
        for (Product p:this.productList) {
            System.out.println("urun adı:>"+p.getName()+" fiyat:>"+p.getPrice());
        }
    }
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
