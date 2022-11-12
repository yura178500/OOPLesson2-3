public class Predators extends Mammals {

    public void toEat() {
        super.toEat();
    }


    public void sleep() {
        super.sleep();
    }


    public void movements() {
        super.movements();
    }

    public String typeOfFood;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }


    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", movementSpeed=" + movementSpeed +
                ", animalNickname='" + getAnimalNickname() + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }

    public Predators(String animalNickname, int numberOfYears, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(animalNickname, numberOfYears, livingEnvironment, movementSpeed);
        if (typeOfFood != null || typeOfFood.isEmpty()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public Predators(String animalNickname, int numberOfYears, String typeOfFood) {
        super(animalNickname, numberOfYears);
        if (typeOfFood != null || typeOfFood.isEmpty()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public void hunt() {
        System.out.println("на охоте");
    }
}
