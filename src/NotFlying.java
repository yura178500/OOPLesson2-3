public class NotFlying extends Birds{
    public String typeOfMovement;


    public String toString() {
        return "NotFlying{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", animalNickname='" + getAnimalNickname() + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }

    public NotFlying(String animalNickname, int numberOfYears, String livingEnvironment, String typeOfMovement) {
        super(animalNickname, numberOfYears, livingEnvironment);
        if (typeOfMovement != null || typeOfMovement.isEmpty() ) {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }
    public void walk() {
        System.out.println("Надо погулять");
    }
}
