public class RefrigeratorAdapter implements PowerOutlet {

    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String PlugIn() {
        return refrigerator.startCooling();
    }
}
