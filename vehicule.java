//class
public class vehicule
{
    public String Brand;
    public String Model;
    public int Years;
    public int Weight;
    public int Wheels;
    public vehicule(String brand, String model, int years)
    {
        Brand = brand;
        Model = model;
        Years = years;
    }
    public void accelerate() {
        System.out.println("I'm putting the pedal to the metal! (Let's hope the car doesn't explode)");
    }
    public void brak() {
        System.out.println("Woah! Slow down boy !");
    }
    public void descriptor() {
        System.out.println("I'm a " +Brand+ " " +Model+ "made in " +Years+ ".");
    }
}


