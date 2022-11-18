public class WashingMachine {
    private double length;
    private double height;
    private double depth;
    private String manufacturer;
    private String deviceName;
    private String deviceType;
    private double nrgCon;
    private static int counter;
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
    public int getCounter()
    {
        return counter;
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
    /** public constructor **/
    public WashingMachine(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon)
    {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.manufacturer = manufacturer;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.nrgCon = nrgCon;
        counter++;
    }
    /** ............ **/
    /** private constructor **/
    private WashingMachine(int rpm, int washCap, boolean startDelay, boolean digitalScreen, String nrgClass)
    {
        this.rpm = rpm;
        this.washCap = washCap;
        this.startDelay = startDelay;
        this.digitalScreen = digitalScreen;
        this.nrgClass = nrgClass;
    }
    /** ............ **/

}
