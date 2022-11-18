public class Oven {
    private double length;
    private double height;
    private double depth;
    private String manufacturer;
    private String deviceName;
    private String deviceType;
    private double nrgCon;
    private static int counter;
    private int ovenCap;
    private String nrgClass;
    private String colour;
    private boolean wifi;
    private boolean digitalScreen;





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
    /** ............ **/
    /** public constructor **/
    public Oven(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon)
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
    private Oven(int ovenCap, String nrgClass, String colour, boolean wifi, boolean digitalScreen)
    {
        this.ovenCap = ovenCap;
        this.nrgClass = nrgClass;
        this.colour = colour;
        this.wifi = wifi;
        this.digitalScreen = digitalScreen;
    }
    /** ............ **/

}
