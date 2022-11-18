public class Fridge {
    private double length;
    private double height;
    private double depth;
    private String manufacturer;
    private String deviceName;
    private String deviceType;
    private double nrgCon;
    private static int counter;
    private int totalCap;
    private int freezerCap;
    private int fridgeCap;
    private boolean coldWater;
    private boolean iceCubes;




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
    public void setTotalCap(int totalCap)
    {
        this.totalCap = totalCap;
    }
    public void setFreezerCap(int freezerCap)
    {
        this.freezerCap = freezerCap;
    }
    public void setFridgeCap(int fridgeCap)
    {
        this.fridgeCap = fridgeCap;
    }
    public void setColdWater(boolean coldWater)
    {
        this.coldWater = coldWater;
    }
    public void setIceCubes(boolean iceCubes)
    {
        this.iceCubes = iceCubes;
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
    public int getTotalCap()
    {
        return totalCap;
    }
    public int getFreezerCap()
    {
        return freezerCap;
    }
    public int getFridgeCap()
    {
        return fridgeCap;
    }
    public boolean isColdWater()
    {
        return coldWater;
    }
    public boolean isIceCubes()
    {
        return iceCubes;
    }
    /** ............ **/
    /** public constructor **/
    public Fridge(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon)
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
    private Fridge(int totalCap, int freezerCap, int fridgeCap, boolean coldWater, boolean iceCubes)
    {
        this.totalCap = totalCap;
        this.freezerCap = freezerCap;
        this.fridgeCap = fridgeCap;
        this.coldWater = coldWater;
        this.iceCubes = iceCubes;
    }
    /** ............ **/

}
