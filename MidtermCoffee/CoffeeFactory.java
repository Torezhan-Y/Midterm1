class CoffeeFactory{ // Factory method to create coffee objects based on input
    public static Coffee createCoffee(String coffies){
        if (coffies.equals("Espresso")) {
            return new Espresso();
        } else if (coffies.equals("Latte")) {
            return new Latte();
        } else if (coffies.equals("Americano")) {
            return new Americano();
        } else if (coffies.equals("Cappuccino")) {
            return new Cappuccino();
        } else {
            throw new IllegalArgumentException("Such coffee doesnt exist!");
        }
    }
}