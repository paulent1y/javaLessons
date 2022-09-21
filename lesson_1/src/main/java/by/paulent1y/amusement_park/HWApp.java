package by.paulent1y.amusement_park;

public class HWApp {
    public static void main(String[] args) {
        Park park = parkTest();
        System.out.println(park); //displaying park will show all attractions and food it has
        Payment payment = paymentTest(park);
        System.out.println(payment);
    }

    static Park parkTest(){
        Park p = new Park("Energyland");

        //two ways of adding food: short and full
        p.addFood(p.new Food(
                "Hot-dog",
                3f));
        p.addFood(p.new Food(
                "Vegan Donuts",
                19f,
                "Tasty donuts made with almond milk",
                true,
                false));
        p.addFood(p.new Food(
                "Donuts",
                2f,
                "Normal casual donuts. With sugar powder, of course",
                true,
                false));

        //same for attractions
        p.addAttraction(p.new Attraction(
                "Carousel",
                4.5f));
        p.addAttraction(p.new Attraction(
                "Death wheel",
                1f,
                "Absolutely harmless wheel. In the middle of spinning everybody is thrown at the sky. No safe belts, no catching, no parachutes",
                10));
        p.addAttraction(p.new Attraction(
                "Golden tower",
                153.27f,
                "So you getting up, an.. and then getting down! And its all made from GOLD! Cool, right?! Cost is also cool, ",
                0));

        return p;
    }

    static Payment paymentTest(Park park) {
        Payment payment = new Payment();
        int temp = 0;
        for (Park.Food f: park.foods){
            temp++;
            payment.addPosition(f, temp);
        }
        temp = 0;
        for (Park.Attraction a: park.attractions){
            temp++;
            payment.addPosition(a, temp);
        }



        return payment;
    }
}
