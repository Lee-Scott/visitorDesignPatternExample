package visitorImplements;

import taxCategories.Guns;
import taxCategories.Liquor;
import taxCategories.Necessity;
import taxCategories.Tobacco;
import visitorInterface.Visitor;

import java.text.DecimalFormat;

// Concrete Visitor Class

public class TaxVisitor implements Visitor {

    // This formats the item prices to 2 decimal places

    DecimalFormat df = new DecimalFormat("#.##");

    // This is created so that each item is sent to the
    // right version of visit() which is required by the
    // Visitor interface and defined below

    public TaxVisitor() {
    }

    // Calculates total price based on this being taxed
    // as a liquor item

    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a tobacco item

    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a necessity item

    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a guns item

    @Override
    public double visit(Guns gunItem) {
        System.out.println("Gun Item: Price with Tax");
        return Double.parseDouble(df.format((gunItem.getPrice() * .25 ) + gunItem.getPrice()));

    }

}