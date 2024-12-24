public class Dolphin extends Animal implements Swim {
    private int swimmingSpeed = 15;
    private String color = "Blue";

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dolphin() {
        super("Dolphin");
    }


    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }



    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }


    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + this.swimmingSpeed);
    }

}
