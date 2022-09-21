package by.paulent1y.amusement_park;

import java.util.Arrays;

class Park {
    String parkName;
    Food[] foods;
    Attraction[] attractions;

    class Attraction extends BuyableProduct {
        int minAge;

        public Attraction(String _name, float _cost) {
            super(_name, _cost);
            description = "";
            minAge = 0;
        }

        public Attraction(String _name, float _cost, String _description, int _minAge) {
            super(_name, _cost, _description);
            minAge = _minAge;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Attraction: ");
            sb.append(name).append("\n");
            if (!description.equals(""))
                sb.append(description).append("\n");
            sb.append("Cost: ").append(cost).append("\tAge:");
            if (minAge == 0) sb.append(" no restrictions\n");
            else sb.append(" older than ").append(minAge).append("\n");


            return sb.toString();
        }
    }

    class Food extends BuyableProduct {
        boolean veganFriendly;
        boolean glutenFree;

        public Food(String _name, float _cost) {
            super(_name, _cost);
            description = "";
            veganFriendly = false;
            glutenFree = false;
        }

        public Food(
                String _name,
                float _cost,
                String _description,
                boolean _veganFriendly,
                boolean _glutenFree) {
            super(_name, _cost, _description);
            veganFriendly = _veganFriendly;
            glutenFree = _glutenFree;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Food: ");
            sb.append(name).append("\n");
            if (!description.equals(""))
                sb.append(description).append("\n");

            if (veganFriendly) sb.append("Good for vegans!\n");
            if (glutenFree) sb.append("Free from gluten!\n");
            sb.append("Cost: ").append(cost).append("\n");
            return sb.toString();
        }
    }


    public Park(String _parkName) {
        parkName = _parkName;
        foods = new Food[0];
        attractions = new Attraction[0];
    }

    public void addFood(Food f) {
        foods = Arrays.copyOf(foods, foods.length + 1);
        foods[foods.length - 1] = f;
    }

    public void addAttraction(Attraction a) {
        attractions = Arrays.copyOf(attractions, attractions.length + 1);
        attractions[attractions.length - 1] = a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marvelous amusement park \"");
        sb.append(parkName).append("\"\n");
        for (Attraction a: attractions){
            sb.append(a);
            sb.append("\n");
        }
        for (Food f: foods){
            sb.append(f);
            sb.append("\n");
        }
        return sb.toString();
    }
}
