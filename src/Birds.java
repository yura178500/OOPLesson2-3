public class Birds extends Animals {
    public String livingEnvironment;


    public String toString() {
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", animalNickname='" + getAnimalNickname() + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }

    public Birds(String animalNickname, int numberOfYears, String livingEnvironment) {
        super(animalNickname, numberOfYears);
        if (livingEnvironment != null || livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {
        System.out.println("на охоте");
    }
}
