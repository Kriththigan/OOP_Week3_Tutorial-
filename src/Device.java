public class Device {
    private String brand;
    private String model;
    public Device(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void setBrand(String newBrand){
        brand = newBrand;
    }
    public void setModel(String newModel){
        model = newModel;
    }
}