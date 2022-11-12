public class Herbivores extends Mammals {

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

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", movementSpeed=" + movementSpeed +
                ", animalNickname='" + getAnimalNickname() + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }

    public Herbivores(String animalNickname, int numberOfYears, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(animalNickname, numberOfYears, livingEnvironment, movementSpeed);
        if (typeOfFood != null || typeOfFood.isEmpty()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public Herbivores(String animalNickname, int numberOfYears, String typeOfFood) {
        super(animalNickname, numberOfYears);
        if (typeOfFood != null || typeOfFood.isEmpty()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void graze() {
        System.out.println("Нужно пастись");

    }

}
