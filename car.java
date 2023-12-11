public class car extends vehicule
{
    public car(String Brand, String Model, int Years, int weight, int wheels) {
        super(Brand, Model, Years);
        Weight = weight;
        Wheels = wheels;
    }
    public void descriptor() {
        System.out.println("I'm a " +Brand+ " " +Model+ "made in " +Years+ ".");
    }
    public void roue() {
        System.out.println("Im a Ferrari, I weight " +Weight+ " kg and I have " +Wheels+ " Wheels.");
    }

}
