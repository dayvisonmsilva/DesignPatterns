package facade;

public class BuilderFacade {
    private MainDishBuilder mainDishBuilder;
    private VeganDishBuilder veganDishBuilder;

    public BuilderFacade() {
        this.mainDishBuilder = new MainDishBuilder();
        this.veganDishBuilder = new VeganDishBuilder();
    }

    public void makeMeal1() {
        mainDishBuilder.makeMeal();
        Meal meal1 = mainDishBuilder.getMeal();
        System.out.println(meal1);
        System.out.println("Price: $" + meal1.getPrice());
    }

    public void makeMeal2() {
        mainDishBuilder.reset();
        Meal meal2 = mainDishBuilder.makeBeverage().getMeal();
        System.out.println(meal2);
    }

    public void makeMeal3() {
        Meal veganMeal = veganDishBuilder.makeMeal().getMeal();
        System.out.println(veganMeal);
        System.out.println("Price: $" + veganMeal.getPrice());
    }
}