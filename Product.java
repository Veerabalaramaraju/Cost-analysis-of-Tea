class Product {
    private String name;
    private int year;
    private double price;
    
    public Product(String name, int year, double price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getPrice() {
        return price;
    }
}
