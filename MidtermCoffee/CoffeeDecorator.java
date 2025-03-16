abstract class CoffeeDecorator implements Coffee{  // Abstract decorator class implementing Coffee interface
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    public double getCost(){
        return coffee.getCost(); // Delegates cost calculation to the wrapped coffee object
    }
    public String getDescription(){
        return coffee.getDescription(); // Delegates description retrieval
    }
}


// Concrete decorators adding extra ingredients
class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2.02; // Adds cost of milk
    }
    public String getDescription(){
        return super.getDescription()+" with added milk";
    }
}


class CaramelDecorator extends CoffeeDecorator{
    public CaramelDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2.02; // Adds cost of caramel syrup
    }
    public String getDescription(){
        return super.getDescription()+" with added caramel syrup";
    }
}

class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2.02; // Adds cost of whipped cream
    }
    public String getDescription(){
        return super.getDescription()+" with added whipped cream";
    }
}


class ChocolateDecorator extends CoffeeDecorator{
    public ChocolateDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2.02; // Adds cost of chocolate syrup
    }
    public String getDescription(){
        return super.getDescription()+" with added chocolate syrup";
    }
}
