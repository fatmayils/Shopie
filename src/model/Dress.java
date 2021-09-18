package model;

public class Dress extends Product{
    private String beden;

    public Dress(String beden,String name,String code,Double price) {
        this.beden = beden;
        super.setCode(code);
        super.setName(name);
        super.setPrice(price);
    }

    public String getBeden() {
        return beden;
    }

    public void setBeden(String beden) {
        this.beden = beden;
    }
}
