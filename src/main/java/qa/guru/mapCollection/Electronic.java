package qa.guru.mapCollection;

public class Electronic {

    private String marker;
    private String device;
    private double price;

    public Electronic(String marker, String device, double price) {
        this.marker = marker;
        this.device = device;
        this.price = price;
    }

    void sayDevice() {
        System.out.println("Девайс : " + device);
    }
}
