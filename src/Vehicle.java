public class Vehicle {
    private String brand;
    private int year;
    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
    public void setBrand(String newBrand){
        brand = newBrand;
    }
    public void setYear(int newYear){
        year = newYear;
    }
}
