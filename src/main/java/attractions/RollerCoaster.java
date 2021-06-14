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
        if(visitor.age > 12 && visitor.height >145){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double defaultPriceForVisitor(Visitor visitor) {
        if(visitor.height > 200){
            return (8.40)*2;
        }
    }
}
