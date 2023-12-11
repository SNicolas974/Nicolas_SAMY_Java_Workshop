public class JavaProgeam {
    public static void main(String[]args) {
        vehicule voiture = new vehicule("Wolwagen", "Sciroco", 2008);
        voiture.descriptor();
        voiture.accelerate();
        System.out.println('\n');

        Truck truck = new Truck("Scania", "Frostfire", 2022, 6000, 6);
        truck.descriptor();
        truck.roue();
        System.out.println('\n');

        car vehiCar = new car ("Ferrari", "TEstarossa", 2022, 6000, 6);
        vehiCar.descriptor();
        vehiCar.roue();
        System.out.println('\n');

        motorcycle moto = new motorcycle ("Kawazaki", "Ninja", 2022, 6000, 6);
        moto.descriptor();
        moto.roue();
        System.out.println('\n');

        vehiCar.accelerate();
        truck.accelerate();
        moto.accelerate();
    }
}
