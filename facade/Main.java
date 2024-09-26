package facade;

public class Main {
    public static void main(String[] args) {
        BuilderFacade facade = new BuilderFacade();

        System.out.println("Meal 1:");
        facade.makeMeal1(); // Cria um prato principal e exibe

        System.out.println("\nMeal 2:");
        facade.makeMeal2(); // Reseta e cria uma bebida

        System.out.println("\nMeal 3:");
        facade.makeMeal3(); // Cria um prato vegano
    }
}