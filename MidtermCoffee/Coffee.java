interface Coffee{
    double getCost(); // Returns the cost of the coffee
    String getDescription();  // Returns the description of the coffee
}

// Base coffee types implementing the Coffee interface
class Espresso implements Coffee{
    public double getCost(){
        return 1.11; // Base cost of Espresso
    }
    public String getDescription(){
        return "Espresso";
    }
}

class Cappuccino implements Coffee{
    public double getCost(){
        return 2.22; // Base cost of Cappuccino
    }
    public String getDescription(){
        return "Cappuccino";
    }
}

class Latte implements Coffee{
    public double getCost(){
        return 3.33; // Base cost of Latte
    }
    public String getDescription(){
        return "Latte";
    }
}

class Americano implements Coffee{
    public double getCost(){
        return 4.44;  // Base cost of Americano
    }
    public String getDescription(){
        return "Americano";
    }
}