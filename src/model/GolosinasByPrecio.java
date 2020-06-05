package model;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class GolosinasByPrecio implements Comparator<Golosinas> {

    @Override
    public int compare(Golosinas o1, Golosinas o2) {
        return Double.compare(o2.getPrecioUnitario(), o1.getPrecioUnitario());
    }
}
