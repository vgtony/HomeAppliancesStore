public class Fridge {
    private double length;
    private double height;
    private double depth;
    private String manufacturer;
    private String deviceName;
    private String deviceType;
    private double nrgCon;
    private static int counterFridge=0;
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
    public int getCounterFridge()
    {
        return counterFridge;
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
    /** constructor **/
    public Fridge(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon, int totalCap, int freezerCap, int fridgeCap, boolean coldWater, boolean iceCubes)
    {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.manufacturer = manufacturer;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.nrgCon = nrgCon;
        this.totalCap = totalCap;
        this.freezerCap = freezerCap;
        this.fridgeCap = fridgeCap;
        this.coldWater = coldWater;
        this.iceCubes = iceCubes;
        counterFridge++;
    }
    /** ............ **/

    /** prints the characteristics, values imported in main **/
    public void printFridge()
    {
        System.out.println("CHARACTERISTICS \n" );
        System.out.println("Manufacturer || Device Type ||  Device Name : " +this.manufacturer+ " || " +this.deviceType+ " || "+this.deviceName);
        System.out.println("Length || Height || Depth : " +this.length+ " || " +this.height+ " || " +this.depth);
        System.out.println("Energy Consumption : " +this.nrgCon);
        System.out.println("Capacities Total || Freezer || Fridge " +this.totalCap+ " || " +this.freezerCap+ " || " +this.fridgeCap);
        System.out.println("Cold Water || Ice Cube functions : " +this.coldWater+ " || " +this.iceCubes);
    }
    public void periodicMaintenance(){}

}
