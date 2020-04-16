package taxCategories;

import visitorInterface.Visitable;
import visitorInterface.Visitor;

public class Tobacco implements Visitable, Item {

    private double price;

    public Tobacco(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}