public class Plugger {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet LaptopPO = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet RefPO = new RefrigeratorAdapter(refrigerator);

        Smartphone smartphone = new Smartphone();
        PowerOutlet SmartphonePO = new SmartphoneAdapter(smartphone);

        System.out.println(LaptopPO.PlugIn());
        System.out.println(RefPO.PlugIn());
        System.out.println(SmartphonePO.PlugIn());
        System.out.println("All devices are plug in! ");
    }

}
