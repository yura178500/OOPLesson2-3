public class Amphibians extends Animals{
    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", animalNickname='" + animalNickname + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }

    public Amphibians(String animalNickname, int numberOfYears) {
        super(animalNickname, numberOfYears);
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

    public Amphibians(String animalNickname, int numberOfYears, String livingEnvironment) {
        super(animalNickname, numberOfYears);
        if (livingEnvironment !=null|| livingEnvironment.isEmpty()) {
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
