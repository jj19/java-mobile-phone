import java.math.BigInteger;
import java.util.Scanner;
public class MobilePhone {
    String brand, model , phoneNumber;
    int storageCapacity;
    Scanner input = new Scanner(System.in);

    public MobilePhone(String brand, String model, String phoneNumber, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.storageCapacity = storageCapacity;
    }
    public MobilePhone(){

    }
    public void setPhoneNumber(String number){
        this.phoneNumber = number;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setStorageCapacity(int capacity) {
        this.storageCapacity = capacity;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void makeCall(String numberToCall) {
        System.out.println("We are calling " + numberToCall + " from our " + this.brand + " " + this.model + " " + "phone!\n");;
    }
    public void installApp(String appName) {
        System.out.println("Installing " + appName + " on our " + this.brand + " " + this.model + " phone!\n");
    }
    public void displayInfo(){
        System.out.printf(
                " Brand: %s\n" +
                        " Model: %s\n" +
                        " Phone Number: %s\n" +
                        " Storage Capacity: %dGB\n", brand, model, phoneNumber, storageCapacity
        );
    }
}
