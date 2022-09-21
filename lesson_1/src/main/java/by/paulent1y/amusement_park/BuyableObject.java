package by.paulent1y.amusement_park;

class BuyableProduct {
    String name;
    String description;
    float cost;

    public BuyableProduct(String _name, float _cost) {
        name = _name;
        cost = _cost;
    }

    public BuyableProduct(String _name, float _cost, String _description){
        this(_name, _cost);
        description = _description;
    }

}
