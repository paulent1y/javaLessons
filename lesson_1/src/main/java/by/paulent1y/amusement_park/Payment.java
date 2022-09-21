package by.paulent1y.amusement_park;

import java.util.Arrays;
import java.util.Random;

public class Payment {
    final static int rowLength = 40;
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
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            for (int i=0; i<rowLength - name.length(); i++)
                sb.append(".");
            sb.append(cost).
                append("$ x ").
                append(amount).
                append(" -> ").
                append(total).
                append("$");
            return sb.toString();
        }
    }

    public void addPosition(BuyableProduct p, int amount) {
        positions = Arrays.copyOf(positions, positions.length + 1);
        positions[positions.length - 1] = new Position("("+ p.getClass().getSimpleName() + ") " + p.name, amount, p.cost);
    }

    //deprecated XD
    public Position getNewPosition(BuyableProduct p, int amount) {
        return new Position(p.name, amount, p.cost);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Payment check #");
        sb.append(new Random().nextInt(111111, 200000)).append("#:\n");
        float total = 0;
        for (Position p: positions){
            total+= p.total;
            sb.append(p);
            sb.append("\n");
        }
        final String totalRow = "Total payment cost";
        sb.append(totalRow);
        for (int i=0; i<rowLength - totalRow.length(); i++)
            sb.append(".");
        sb.append(total);
        sb.append("$\nPlease pay before entering any attraction or eating food!");

        return sb.toString();
    }
}
