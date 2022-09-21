package by.paulent1y.amusement_park;

import java.util.Arrays;

public class Payment {

    Position[] positions;

    public Payment() {
        positions = new Position[0];
    }

    class Position {
        String name;
        int amount;
        float cost;
        float total;
        public Position(String _name, int _amount, float _cost) {
            name = _name;
            amount = _amount;
            cost = _cost;
            total = cost * amount;
        }

        public String toString() {
            return name + "..." + cost + "$ x " + amount + " -> " + total;
        }
    }

    public void addPosition(BuyableProduct p, int amount) {
        positions = Arrays.copyOf(positions, positions.length + 1);
        positions[positions.length - 1] = new Position(p.name, amount, p.cost);
    }

    public Position getNewPosition(BuyableProduct p, int amount) {
        return new Position(p.name, amount, p.cost);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Payment check:\n");
        float total = 0;
        for (Position p: positions){
            total+= p.total;
            sb.append(p);
            sb.append("\n");
        }
        sb.append("Total payment cost.....");
        sb.append(total);
        return sb.toString();
    }
}
