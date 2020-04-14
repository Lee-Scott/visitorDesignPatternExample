package visitorInterface;// The visitor pattern is used when you have to perform
// the same action on many objects of different types

import taxCategories.Guns;
import taxCategories.Liquor;
import taxCategories.Necessity;
import taxCategories.Tobacco;

public interface Visitor {

    // Created to automatically use the right
    // code based on the Object sent
    // Method Overloading

    public double visit(Liquor liquorItem);

    public double visit(Tobacco tobaccoItem);

    public double visit(Necessity necessityItem);

    public double visit(Guns gunItem);

}