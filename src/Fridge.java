public class Fridge extends Device{

    private static int counterFridge=0;
    private int totalCap;
    private int freezerCap;
    private int fridgeCap;
    private boolean coldWater;
    private boolean iceCubes;


    /* setters */

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

    /* getters */
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

    /* constructor */
    public Fridge(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon, int totalCap, int freezerCap, int fridgeCap, boolean coldWater, boolean iceCubes, boolean status)
    {
        super(length, height, depth, manufacturer, deviceName, deviceType, nrgCon, status);
        this.totalCap = totalCap;
        this.freezerCap = freezerCap;
        this.fridgeCap = fridgeCap;
        this.coldWater = coldWater;
        this.iceCubes = iceCubes;
        counterFridge++;
    }

    /** prints the characteristics, values imported in main */
    public void printFridge()
    {
        System.out.println("CHARACTERISTICS \n" );
        System.out.println("Manufacturer || Device Type ||  Device Name : " +getManufacturer()+ " || " +getDeviceType()+ " || "+getDeviceName());
        System.out.println("Length || Height || Depth : " +getLength()+ " || " +getHeight()+ " || " +getDepth());
        System.out.println("Energy Consumption : " +getNrgCon());
        System.out.println("Capacities Total || Freezer || Fridge " +this.totalCap+ " || " +this.freezerCap+ " || " +this.fridgeCap);
        System.out.println("Cold Water || Ice Cube functions : " +this.coldWater+ " || " +this.iceCubes);
    }
    private void periodicMaintenance(){}

}
