package taxCategories;

import visitorInterface.Visitable;
import visitorInterface.Visitor;

public class Liquor implements Visitable {

    private double price;

    public Liquor(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}