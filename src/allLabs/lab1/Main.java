package allLabs.lab1;

public class Main {
    public static void main(String[] args) {
        HouseholdAppliances[] array = HouseholdAppliances.generateArray(50);
        for (HouseholdAppliances newspapers : array) {
            System.out.println(newspapers);
        }
        System.out.println("=================");
        HouseholdAppliances.filterObjectsByType(array, "Large appliances");
        System.out.println("=================");
        HouseholdAppliances.filterObjectsByPrice(array);
        System.out.println("=================");
        HouseholdAppliances.filterObjectsByCompany(array,"Bosch");
    }
}
