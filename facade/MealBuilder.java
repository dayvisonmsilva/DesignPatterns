package facade;

public interface MealBuilder {
    MealBuilder makeMeal();
    MealBuilder makeBeverage();
    Meal getMeal();
    void reset();
}