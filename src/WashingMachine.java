public class WashingMachine {
    private static int counterWash=0;
    private int rpm;
    private int washCap;
    private boolean digitalScreen;
    private boolean startDelay;
    private String nrgClass;




    /** setters */

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
    /** ............ */
    /** getters */

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
    /** ............ */
    /** constructor */
    public WashingMachine(double length, double height, double depth, String manufacturer, String deviceName, String deviceType, double nrgCon, int rpm, int washCap, boolean startDelay, boolean digitalScreen, String nrgClass, boolean status)
    {
        this.rpm = rpm;
        this.washCap = washCap;
        this.startDelay = startDelay;
        this.digitalScreen = digitalScreen;
        this.nrgClass = nrgClass;
        counterWash++;
    }

    /** ............ */
    /** prints the characteristics, values imported in main */
    public void printWash()
    {
        System.out.println("CHARACTERISTICS \n" );
        System.out.println("Manufacturer || Device Type ||  Device Name : " +Device.manufacturer+ " || " +Device.deviceType+ " || "+Device.deviceName);
        System.out.println("Length || Height || Depth : " +Device.length+ " || " +Device.height+ " || " +Device.depth);
        System.out.println("Energy Consumption : " +Device.nrgCon);
        System.out.println("Washing Capacity(kg) || RPM || Start Delay " +this.washCap+ " || " +this.rpm+ " || " +this.startDelay);
        System.out.println("Digital Screen || Energy Class : " +this.digitalScreen+ " || " +this.nrgClass);
    }
    public void periodicMaintenance(){}

}
