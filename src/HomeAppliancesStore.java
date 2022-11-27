/**
 * @author vgtony
 * This is a program for manually inputing values and print them throught the classes.
 *
 *
 */
public class HomeAppliancesStore {
/** setters-getters */
    static int counter=0;
    static String CompanyName;
    static String Address;
    static int Employees;
    public static String getCompanyName()
    {
        return CompanyName;
    }
    public static String getAddress()
    {
        return Address;
    }
    public static int getEmployees()
    {
        return Employees;
    }

    public static void setCompanyName(String newCompanyName)
    {
        CompanyName = newCompanyName;
    }
    public static void setAddress(String newAddress)
    {
       Address = newAddress;
    }
    public static void setEmployees(int newEmployees)
    {
        Employees = newEmployees;
    }

    /**
     * checks if all arguments are correctly inputed and prints the corresponding messages
     * reads the inputs and prints the characteristics of Devices with the help from the other classes
     * @param args array of inputs
     */
    public static void main(String[] args)  {
        /* checks for existing or non-existing arguments */
        if (args.length == 0) {
            System.out.println("Please enter the Company Name, the Address and the number of employees");
        }
        else if (args.length == 1 ) {
            setCompanyName(args[0]);
            System.out.println("Please enter the Address and the number of employees");
        }
        else if (args.length == 2) {
            setCompanyName(args[0]);
            setAddress(args[1]);
            System.out.println("Please enter the number of employees");
        }
        else {
            setCompanyName(args[0]);
            setAddress(args[1]);
            setEmployees(Integer.parseInt(args[2]));
            System.out.println("Company name is " +getCompanyName() + " on the Address " +getAddress() + " with an army of " +getEmployees() +" employees");
        }
        /* imports values */
        Fridge fridge1 = new Fridge(80, 193, 80, "Pitsos", "PKNB56XLEP",
                "FridgeFreezer", 262, 444, 111, 333, true, false);
        Fridge fridge2 = new Fridge(60, 186, 66, "Bosch", "KGN36NLEA",
                "FridgeFreezer", 239, 666, 222, 444, true, true);
        WashingMachine washMach1 = new WashingMachine(59.8, 84.8, 59, "Pitsos", "WUP1403G9",
                "Washing Machine", 46, 120, 9, true, true, "A");
        WashingMachine washMach2 = new WashingMachine(60, 85, 55, "Samsung", "WW90TA046AE",
                "Washing Machine", 49, 90, 8, false, false, "D");
        Oven oven1 = new Oven(60, 85, 60, "Pitsos", "PHC009150", "Oven",
                320, 12, "B", "Black", false, false );
        Oven oven2 = new Oven(59.4, 59.5, 54.8, "Bosch", "HBA513BS00", "Oven",
                340, 16, "A", "White", true, true);
        AirCondition airCon1 = new AirCondition(805, 285, 194, "Pitsos", "Athina Premium Style",
                "AirCondition", 221, 15000, 12000, false, true, "White");
        AirCondition airCon2 = new AirCondition(770, 288, 234, "Daikin", "Siesta Sensira",
                "AirCondition", 178, 17000, 16000, true, true, "White");

        /* prints the imported values */
        fridge1.printFridge();
        fridge2.printFridge();
        washMach1.printWash();
        washMach2.printWash();
        oven1.printOven();
        oven2.printOven();
        airCon1.printAc();
        airCon2.printAc();
        /* adds the counters from all the classes and prints them individually and in total */
        counter = fridge2.getCounterFridge() + washMach2.getCounterWash() + oven2.getCounterOven() + airCon2.getCounterAc();
        System.out.println("\n The individual amount of devices is Fridge= " +fridge2.getCounterFridge()+ " || Washing Machine= " +washMach2.getCounterWash()+ " || Oven= " +oven2.getCounterOven()+ " || Air Condition= " +airCon2.getCounterAc()+ ". With a total amount of " +counter+ " devices.");
    }

}