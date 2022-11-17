public class HomeAppliancesStore {

    static String CompanyName;
    static String Address;
    static int Employees;

    public static void main(String args[])  {
        setCompanyName(args);
        setAddress(args);
        setEmployees(args);

        if (CompanyName == null) {
            System.out.println("Please enter the Company Name, the Address and the number of employees");
        }
        else if (Address == null ) {
            System.out.println("Please enter the Address and the number of employees");
        }
        else if (Employees <= 0) {
            System.out.println("Please enter the number of employees");
        }

        System.out.println("Company name is " +getCompanyName() + " on the Address " +getAddress() + " with an army of " +getEmployees() +" employees");
    }
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
    public static void setCompanyName(String[] args)
    {
        CompanyName = args[0];
    }
    public static void setAddress(String[] args)
    {
        Address = args[1];
    }
    public static void setEmployees(String[] args)
    {
        Employees = Integer.parseInt(args[2]);
    }
}