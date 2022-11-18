public class AirCondition {
    private double length;
    private double height;
    private double depth;
    private String manufacturer;
    private String deviceName;
    private String deviceType;
    private double nrgCon;
    private static int counterAc=0;
    private int coolBTU;
    private int heatBTU;
    private boolean wifi;
    private boolean airFilter;
    private String colour;




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
    public void setHeatBTU(int heatBTU)
    {
        this.heatBTU = heatBTU;
    }
    public void setCoolBTU(int coolBTU)
    {
        this.coolBTU = coolBTU;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public void setWifi(boolean wifi)
    {
        this.wifi = wifi;
    }
    public void setSAirFilter(boolean airFilter)
    {
        this.airFilter = airFilter;
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
    public int getCounterAc()
    {
        return counterAc;
    }
    public int getHeatBTU()
    {
        return heatBTU;
    }
    public int getCoolBTU()
    {
        return coolBTU;
    }
    public String getColour()
    {
        return colour;
    }
    public boolean isWifi()
    {
        return wifi;
    }
    public boolean isAirFilter()
    {
        return airFilter;
    }
    /** ............ **/
    /** public constructor **/
    public AirCondition(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon, int coolBTU, int heatBTU, boolean wifi, boolean airFilter, String colour)
    {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.manufacturer = manufacturer;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.nrgCon = nrgCon;
        this.coolBTU = coolBTU;
        this.heatBTU = heatBTU;
        this.wifi = wifi;
        this.airFilter = airFilter;
        this.colour = colour;
        counterAc++;
    }
    /** ............ **/
    /** prints the characteristics, values imported in main **/
    public void printAc()
    {
        System.out.println("CHARACTERISTICS \n" );
        System.out.println("Manufacturer || Device Type ||  Device Name : " +this.manufacturer+ " || " +this.deviceType+ " || "+this.deviceName);
        System.out.println("Length || Height || Depth : " +this.length+ " || " +this.height+ " || " +this.depth);
        System.out.println("Energy Consumption : " +this.nrgCon);
        System.out.println("Cooling Power || Heating Power  " +this.coolBTU+ " || " +this.heatBTU);
        System.out.println("WiFi || Air Filter || Colour : " +this.wifi+ " || " +this.airFilter+ " || " +this.colour);
    }
    public void periodicMaintenance(){}

}
