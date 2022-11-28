public class Oven extends Device {

    private static int counterOven=0;
    private int ovenCap;
    private String nrgClass;
    private String colour;
    private boolean wifi;
    private boolean digitalScreen;





    /** setters */

    public void setOvenCap(int ovenCap)
    {
        this.ovenCap = ovenCap;
    }
    public void setNrgClass(String nrgClass)
    {
        this.nrgClass = nrgClass;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public void setWifi(boolean wifi)
    {
        this.wifi = wifi;
    }
    public void setDigitalScreen(boolean digitalScreen)
    {
        this.digitalScreen = digitalScreen;
    }
    /** ............ */
    /** getters */
    public int getCounterOven()
    {
        return counterOven;
    }
    public int getOvenCap()
    {
        return ovenCap;
    }
    public String nrgClass()
    {
        return nrgClass;
    }
    public String getColour()
    {
        return colour;
    }
    public boolean isWifi()
    {
        return wifi;
    }
    public boolean isDigitalScreen()
    {
        return digitalScreen;
    }
    /** ............ */
    /** public constructor */
    public Oven(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon, int ovenCap, String nrgClass, String colour, boolean wifi, boolean digitalScreen, boolean status)
    {
        super(length, height, depth, manufacturer, deviceName, deviceType, nrgCon, status);
        this.ovenCap = ovenCap;
        this.nrgClass = nrgClass;
        this.colour = colour;
        this.wifi = wifi;
        this.digitalScreen = digitalScreen;
        counterOven++;
    }
    /** ............ */
    /** prints the characteristics, values imported in main */
    public void printOven()
    {
        System.out.println("CHARACTERISTICS \n" );
        System.out.println("Manufacturer || Device Type ||  Device Name : " +getManufacturer()+ " || " +getDeviceType()+ " || "+getDeviceName());
        System.out.println("Length || Height || Depth : " +getLength()+ " || " +getHeight()+ " || " +getDepth());
        System.out.println("Energy Consumption : " +getNrgCon());
        System.out.println("Oven Capacity || Energy Class || Colour " +this.ovenCap+ " || " +this.nrgClass+ " || " +this.colour);
        System.out.println("Wifi || Digital Screen : " +this.wifi+ " || " +this.digitalScreen);
    }

    public void periodicMaintenance(){}

}
