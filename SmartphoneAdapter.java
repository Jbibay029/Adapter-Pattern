public class SmartphoneAdapter implements PowerOutlet {

    private Smartphone smartphone;

    public SmartphoneAdapter(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String PlugIn() {
        return smartphone.chargePhone();
    }
}
