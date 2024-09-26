package facade;

public class VeganDishBuilder implements MealBuilder {
    private Meal meal;

    public VeganDishBuilder() {
        this.reset();
    }

    @Override
    public MealBuilder makeMeal() {
        meal.addItem("Vegan Dish", 12.0);
        return this;
    }

    @Override
    public MealBuilder makeBeverage() {
        meal.addItem("Vegan Beverage", 4.0);
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