package model;

public class Jean extends Product {
    private  String boy;
    private String bel;


    public Jean(String boy, String bel,String name,String code,Double price) {
        this.boy = boy;
        this.bel = bel;
        super.setCode(code);
        super.setName(name);
        super.setPrice(price);
    }

    public String getBoy() {
        return boy;
    }

    public void setBoy(String boy) {
        this.boy = boy;
    }

    public String getBel() {
        return bel;
    }

    public void setBel(String bel) {
        this.bel = bel;
    }
}
