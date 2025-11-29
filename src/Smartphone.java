public class Smartphone extends Device{
    private int numberOfStorage;
    public Smartphone(String brand, String model, int storage){
        super(brand, model);
        this.numberOfStorage = storage;
    }
    public int getNumberOfStorage(){
        return numberOfStorage;
    }
    public void setNumberOfStorage(int storage){
        this.numberOfStorage = storage;
    }
    public static void main(String[] args){
        Smartphone phone = new Smartphone("Samsung", "A50", 128);
        System.out.println("Brand:" + phone.getBrand());
        System.out.println("Model:" + phone.getModel());
        System.out.println("Storage:" + phone.getNumberOfStorage() + "GB");
        phone.setNumberOfStorage(256);
        System.out.println("Update Storage:" + phone.getNumberOfStorage() + "GB");
    }
}
