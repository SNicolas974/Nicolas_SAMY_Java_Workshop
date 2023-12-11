public class motorcycle extends vehicule
{
    public motorcycle(String Brand, String Model, int Years, int weight, int wheels) {
        super(Brand, Model, Years);
        Weight = weight;
        Wheels = wheels;
    }
    public void descriptor() {
        System.out.println("I'm a " +Brand+ " " +Model+ "made in " +Years+ ".");
    }
    public void roue() {
        System.out.println("Im a Kawazaki, I weight " +Weight+ " kg and I have " +Wheels+ " Wheels.");
    }
    public void accelerate() {
        System.out.println("my " +Brand+ " goes like this: vRRRVRVR !");
    }
}
