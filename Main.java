public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        System.out.println("Plugging Devices into Power Outlets...\n");
        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();
    }
}