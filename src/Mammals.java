import java.util.Objects;

public class Mammals extends Animals {

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.movementSpeed, movementSpeed) == 0 && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }

    public void toEat() {
        super.toEat();
    }


    public void sleep() {
        super.sleep();
    }


    public void movements() {
        super.movements();
    }

    public String livingEnvironment;
    public double movementSpeed;

    public Mammals(String animalNickname, int numberOfYears, String livingEnvironment, double movementSpeed) {
        super(animalNickname, numberOfYears);
        if (livingEnvironment != null || livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        }
        if (movementSpeed >= 0) {
            this.movementSpeed = movementSpeed;
        }

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public Mammals(String animalNickname, int numberOfYears) {
        super(animalNickname, numberOfYears);
    }

    public void walk() {
        System.out.println("Надо погулять");
    }

}
