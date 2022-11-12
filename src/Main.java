public class Main {
    public static void main(String[] args) {

        Herbivores giraffe = new Herbivores("Лаки", 5, "Африка", 16, "Растительность");
        Herbivores gazelle = new Herbivores("Шустрик", 7, "Африка", 10, "Растительность");
        Herbivores horse = new Herbivores("Бурый", 5, "Россия", 10, "Растительность");
        Predators hyenas = new Predators("Дикий", 5, "Африка", 13, "Плотоядные");
        Predators tiger = new Predators("Полосатый", 5, "Африка", 16, "Плотоядные");
        Predators bear = new Predators("Мишка", 5, "Россия", 15, "Плотоядные");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println("--------------");
        System.out.println(hyenas);
        System.out.println(tiger);
        System.out.println(bear);
        tiger.toEat();
        gazelle.sleep();
        horse.movements();
        giraffe.walk();
        horse.graze();
        bear.hunt();
        System.out.println("----------------------------------");
        Amphibians frog = new Amphibians("Прыгун ", 2, "Болото ");
        Amphibians iMaPrisnovodny = new Amphibians("Прут ", 4, "Болото ");
        System.out.println(frog);
        System.out.println(iMaPrisnovodny);
        frog.hunt();
        System.out.println("-------------------------------------");
        NotFlying peacock = new NotFlying("Хвост ", 4, "Африка ", "ноги ");
        NotFlying penguin = new NotFlying("Пипо ", 2, "Антартика ", "ноги ");
        NotFlying dodoBird = new NotFlying("Дук ", 4, "Африка ", "ноги ");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        dodoBird.walk();
        penguin.hunt();
        System.out.println("-------------------------------------");
        Flying seagull = new Flying("Ден ", 5, "Африка ", " крылья");
        Flying albatross = new Flying("Нос ", 2, "Африка ", "крылья");
        Flying falcon = new Flying("Летун ", 3, "Россия ", "крылья ");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        falcon.toFly();


        System.out.println("----------------------------------");
        System.out.println(giraffe.equals(gazelle));
        System.out.println(giraffe.getClass());


    }



}
