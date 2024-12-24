public class Penguin extends Animal implements Walk, Swim {
    private int swimSpeed = 20;
    private int walkSpeed = 17;
    private boolean isSwimming = false;

    public Penguin() {
        super("Penguin");
    }

    public Penguin(int swimSpeed, int walkSpeed) {
        super("Penguin");
        this.swimSpeed = swimSpeed;
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + this.swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimSpeed=" + swimSpeed +
                ", walkSpeed=" + walkSpeed +
                ", isSwimming=" + isSwimming +
                '}';
    }
}
