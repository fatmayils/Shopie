package model;

public class CartEntry {
    private Product product;
    private Integer qty;
    private Double totalAmount;

    public CartEntry(Product product, Integer qty) {
        this.product = product;
        this.qty = qty;
        this.calculateTotal();
    }
    public void calculateTotal(){
        this.totalAmount=this.product.getPrice()*this.qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
