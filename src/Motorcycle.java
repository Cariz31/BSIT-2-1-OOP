public class Motorcycle extends Vehicle{
    private boolean hasSideCar;
    public Motorcycle(String brand, int year, boolean hasSideCar){
        super(brand, year);
        this.hasSideCar = hasSideCar;
    }
    @Override
    public void displayInfo(){
        if (hasSideCar) {
            System.out.println("Motorcycle: " + brand + " (" + year + ") - with sidecar");
        } else {
            System.out.println("Motorcycle: " + brand + " (" + year + ") - no sidecar");
        }
    }
}
