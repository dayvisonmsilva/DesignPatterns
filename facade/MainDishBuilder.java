package facade;

public class MainDishBuilder implements MealBuilder {
    private Meal meal;

    public MainDishBuilder() {
        this.reset();
    }

    @Override
    public MealBuilder makeMeal() {
        meal.addItem("Main Dish", 15.0);
        return this;
    }

    @Override
    public MealBuilder makeBeverage() {
        meal.addItem("Beverage", 5.0);
        return this;
    }

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void reset() {
        this.meal = new Meal();
    }
}