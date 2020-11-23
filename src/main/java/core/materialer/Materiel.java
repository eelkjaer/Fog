package core.materialer;

abstract class Materiel {
    

    protected final int id;
    protected final String name;
    protected final double price;
    
    public Materiel(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public Materiel(String name, double price) {
        this.id = -1;
        this.name = name;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public abstract String toString();
}