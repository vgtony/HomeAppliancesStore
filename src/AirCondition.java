public class AirCondition {

    private static int counterAc=0;
    private int coolBTU;
    private int heatBTU;
    private boolean wifi;
    private boolean airFilter;
    private String colour;



    /** setters */
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
    /** ............ */
    /** getters */
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
    /** ............ */
    /** public constructor */
    public AirCondition(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon, int coolBTU, int heatBTU, boolean wifi, boolean airFilter, String colour)
    {
        this.coolBTU = coolBTU;
        this.heatBTU = heatBTU;
        this.wifi = wifi;
        this.airFilter = airFilter;
        this.colour = colour;
        counterAc++;
    }
    /** ............ */
    /** prints the characteristics, values imported in main */
    public void printAc()
    {
        System.out.println("CHARACTERISTICS \n" );
        System.out.println("Manufacturer || Device Type ||  Device Name : " +Device.manufacturer+ " || " +Device.deviceType+ " || "+Device.deviceName);
        System.out.println("Length || Height || Depth : " +Device.length+ " || " +Device.height+ " || " +Device.depth);
        System.out.println("Energy Consumption : " +Device.nrgCon);
        System.out.println("Cooling Power || Heating Power  " +this.coolBTU+ " || " +this.heatBTU);
        System.out.println("WiFi || Air Filter || Colour : " +this.wifi+ " || " +this.airFilter+ " || " +this.colour);
    }
    public void periodicMaintenance(){}

}
