package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

import java.util.stream.IntStream;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() > 12;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double defaultPriceForVisitor(Visitor visitor) {
       double multiplier = visitor.getHeight() >= 200 ? 2.0 : 1.0;
       return defaultPrice() * multiplier;
    }
}
