public class WashingMachine {
    private double length;
    private double height;
    private double depth;
    private String manufacturer;
    private String deviceName;
    private String deviceType;
    private double nrgCon;
    private static int counterWash=0;
    private int rpm;
    private int washCap;
    private boolean digitalScreen;
    private boolean startDelay;
    private String nrgClass;




    /** setters **/
    public void setLength(double length)
    {
        this.length = length;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public void setDepth(double depth)
    {
        this.depth = depth;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }
    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }
    public void setNrgCon(double nrgCon)
    {
        this.nrgCon = nrgCon;
    }
    public void setRpm(int rpm)
    {
        this.rpm = rpm;
    }
    public void setWashCap(int washCap)
    {
        this.washCap = washCap;
    }
    public void setStartDelay(boolean startDelay)
    {
        this.startDelay = startDelay;
    }
    public void setDigitalScreen(boolean digitalScreen)
    {
        this.digitalScreen = digitalScreen;
    }
    public void setNrgClass(String nrgClass)
    {
        this.nrgClass = nrgClass;
    }
    /** ............ **/
    /** getters **/
    public double getLength()
    {
        return length;
    }
    public double getHeight()
    {
        return height;
    }
    public double getDepth()
    {
        return depth;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public String getDeviceName()
    {
        return deviceName;
    }
    public String getDeviceType()
    {
        return deviceType;
    }
    public double getNrgCon()
    {
        return nrgCon;
    }
    public int getCounterWash()
    {
        return counterWash;
    }
    public int getRpm()
    {
        return rpm;
    }
    public int getWashCap()
    {
        return washCap;
    }
    public boolean isStartDelay()
    {
        return startDelay;
    }
    public boolean isDigitalScreen()
    {
        return digitalScreen;
    }
    public String getNrgClass()
    {
        return nrgClass;
    }
    /** ............ **/
    /** constructor **/
    public WashingMachine(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon, int rpm, int washCap, boolean startDelay, boolean digitalScreen, String nrgClass)
    {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.manufacturer = manufacturer;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.nrgCon = nrgCon;
        this.rpm = rpm;
        this.washCap = washCap;
        this.startDelay = startDelay;
        this.digitalScreen = digitalScreen;
        this.nrgClass = nrgClass;
        counterWash++;
    }

    /** ............ **/
    /** prints the characteristics, values imported in main **/
    public void printWash()
    {
        System.out.println("CHARACTERISTICS \n" );
        System.out.println("Manufacturer || Device Type ||  Device Name : " +this.manufacturer+ " || " +this.deviceType+ " || "+this.deviceName);
        System.out.println("Length || Height || Depth : " +this.length+ " || " +this.height+ " || " +this.depth);
        System.out.println("Energy Consumption : " +this.nrgCon);
        System.out.println("Washing Capacity(kg) || RPM || Start Delay " +this.washCap+ " || " +this.rpm+ " || " +this.startDelay);
        System.out.println("Digital Screen || Energy Class : " +this.digitalScreen+ " || " +this.nrgClass);
    }
    public void periodicMaintenance(){}

}
