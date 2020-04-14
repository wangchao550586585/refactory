package HandleGeneralizationRelationship.FormTemPlateMethod.refactory;

import case1.prototype.Rental;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/5/16.
 */
public abstract class Statement {
    public String value(Customer customer) {
        Vector<Rental> rentals = customer.getRentals();
        String result = "";
        Enumeration<Rental> elements = rentals.elements();
        while (elements.hasMoreElements()) {
            Rental nextElement = elements.nextElement();
            result = getRentalString(nextElement);
        }
        result += getString(customer);
        return result;
    }

    public abstract String getRentalString(Rental nextElement);

    public abstract String getString(Customer customer);
}
