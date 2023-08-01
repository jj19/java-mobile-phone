public class Main {
    public static void main(String[] args) {
        MobilePhone iPhone = new MobilePhone("Apple", "iPhone 14 Pro Max","4805515122", 256);
        MobilePhone GalaxyS23 = new MobilePhone();

        iPhone.makeCall("5552115990");
        iPhone.installApp("TikTok");
        iPhone.displayInfo();

    }

}
