public class Device {
    static double length;
    static double height;
    static double depth;
    static String manufacturer;
    static String deviceName;
    static String deviceType;
    static double nrgCon;
    private static int counter=0;
    boolean status;



    public Device(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon)
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

    public void powerOn(){
        status = true;
    }
    public void powerOff(){
        status = false;
    }

    /* Setters */
    /**
     *
     * @param length Device Length
     */
    public void setLength(double length)
    {
        this.length = length;
    }

    /**
     *
     * @param height Device Height
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     *
     * @param depth Device Depth
     */
    public void setDepth(double depth)
    {
        this.depth = depth;
    }

    /**
     *
     * @param manufacturer Name of the manufacturer company
     */
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    /**
     *
     * @param deviceName Device Name
     */
    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }

    /**
     *
     * @param deviceType Device Type
     */
    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    /**
     *
     * @param nrgCon Energy Consumption in Watts
     */
    public void setNrgCon(double nrgCon)
    {
        this.nrgCon = nrgCon;
    }

    /* Getters */

    /**
     *
     * @return Device Length
     */
    public double getLength()
    {
        return length;
    }

    /**
     *
     * @return Device Height
     */
    public double getHeight()
    {
        return height;
    }

    /**
     *
     * @return Device Depth
     */
    public double getDepth()
    {
        return depth;
    }

    /**
     *
     * @return Name of the manufacturer company
     */
    public String getManufacturer()
    {
        return manufacturer;
    }

    /**
     *
     * @return Device Name
     */
    public String getDeviceName()
    {
        return deviceName;
    }

    /**
     *
     * @return Device Type
     */
    public String getDeviceType()
    {
        return deviceType;
    }

    /**
     *
     * @return Energy Consumption in Watts
     */
    public double getNrgCon()
    {
        return nrgCon;
    }

    /**
     *
     * @return Counter for all devices
     */
    public int getCounter()
    {
        return counter;
    }


}
