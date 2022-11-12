import java.util.Objects;

public class Animals {
    private String animalNickname;
    public int numberOfYears;


    public Animals(String animalNickname, int numberOfYears) {
        if (animalNickname != null || animalNickname.isEmpty()) {
            this.animalNickname = animalNickname;
        }
        if (numberOfYears >= 0) {
            this.numberOfYears = numberOfYears;
        } else {
            this.numberOfYears = Math.abs(numberOfYears);
        }
    }

    public String getAnimalNickname() {
        return animalNickname;
    }

    public void setAnimalNickname(String animalNickname) {
        this.animalNickname = animalNickname;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void toEat() {
        System.out.println("Покорми меня.");

    }

    public void sleep() {
        System.out.println("Хочу спать.");

    }

    public void movements() {
        System.out.println("Перемещается");

    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return numberOfYears == animals.numberOfYears && animalNickname.equals(animals.animalNickname);
    }


    public int hashCode() {
        return Objects.hash(animalNickname, numberOfYears);
    }

}
