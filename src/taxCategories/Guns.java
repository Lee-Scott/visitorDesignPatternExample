package taxCategories;

import visitorInterface.Visitable;
import visitorInterface.Visitor;

public class Guns {

    private double price;

    public Guns(double item) {
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
