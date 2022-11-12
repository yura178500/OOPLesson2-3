public class Flying extends Birds {
    public String typeOfMovement;


    public String toString() {
        return "Flying{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", animalNickname='" + getAnimalNickname() + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }

    public Flying(String animalNickname, int numberOfYears, String livingEnvironment, String typeOfMovement) {
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
    public void toFly() {
        System.out.println("Надо по летать");
    }
}
