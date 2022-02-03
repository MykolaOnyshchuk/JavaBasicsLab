package allLabs.lab1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class HouseholdAppliances {
    /*Номер,
    Тип, Модель, Назва, Фірма,
Кількість, Ціна, Дата виготовлення.*/
    private int serialNumber;
    private String type;
    private String model;
    private String name;
    private String company;
    private int numberLeft;
    private float price;
    private Calendar productionDate;

    @Override
    public String toString() {
        return "HouseholdAppliances{" +
                "type=" + type +
                "serialNumber=" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", numberLeft=" + numberLeft +
                ", price=" + price +
                ", productionDate=" + productionDate +
                '}';
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNumberLeft() {
        return numberLeft;
    }

    public void setNumberLeft(int numberLeft) {
        this.numberLeft = numberLeft;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Calendar getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Calendar productionDate) {
        this.productionDate = productionDate;
    }

    public HouseholdAppliances(int serialNumber, String type, String model, String name, String company, int numberLeft, float price, Calendar productionDate) {
        this.serialNumber = serialNumber;
        this.type = type;
        this.model = model;
        this.name = name;
        this.company = company;
        this.numberLeft = numberLeft;
        this.price = price;
        this.productionDate = productionDate;
    }
    /*
    String[] nameArr = new String[]{"Forbes", "OTTOBRE", "Вишиванка", "Megatour", "ВСЕ О РУКОДЕЛИИ", "Florium",
        "Sanwerk", "Vivienne", "Адеф-Украина", "Диана плюс"};
String[] typeArr = new String[]{"Газета", "Журнал", "Ежегодник", "Научный журнал", "Календари", "Литературный журнал", "Справочник", "Литература", "Библиографический указатель", "Реферативный сборник"};
String[] companyArr = new String[]{"Грамота", "Ранок", "Освіта", "Генеза", "Академія", "Дух і Літера", "Аверс", "Країна Мрій", "Основи", "Дніпро"};
String[] fullNameArray = new String[]{"Суворов Константин Иванович", "Сидоров Даниил Дмитриевич", "Крылов Ярослав Артёмович", "Васильев Савелий Георгиевич", "Петров Артём Евгеньевич", "Николаев Тимофей Дмитриевич", "Егоров Василий Львович", "Соколов Андрей Львович", "Степанов Максим Андреевич", "Иванов Тимофей Дамирович"};
Newspapers[] array = new Newspapers[count];
for (int i = 0; i < array.length; i++) {
    int randN = new Random().nextInt(nameArr.length);
    int randT = new Random().nextInt(typeArr.length);
    float randPrice = 70 + new Random().nextFloat() * (500 - 70);
    int randPeriod = 1 + (int) (new Random().nextFloat() * (14 - 1));
    int randC = new Random().nextInt(companyArr.length);
    int randF = new Random().nextInt(fullNameArray.length);
    Newspapers obj = new Newspapers(nameArr[randN], typeArr[randT], randPrice, randPeriod, companyArr[randC], fullNameArray[randF]);
    array[i] = obj;
}
return array;
     */

    public static HouseholdAppliances[] generateArray(int count) {
        HouseholdAppliances[] arrayOfObjects = new HouseholdAppliances[count];
        String[] typeArr = new String[]{"Large appliances", "Built-in appliances", "Kitchen appliances", "Cleaning devices"};
        String[] modelArr = new String[]{"RB29FSRNDSA/UA", "KGN39XW326", "RB33J3200SA/UA", "GA-B509MMQM", "RB38T603FSA/UA",
                "XIT8 T2E X", "GA-B509CLZM", "ITIR 4201 W UA", "KGN33NW206"};
        String[] nameArr = new String[]{"Refrigerator", "Washing machine", "Plate", "Freezer", "Grill", "Coffee machine", "Blender", "Vacuum cleaner", "Iron", "Microwave oven"};
        String[] companyArr = new String[]{"Dyson", "Bosch", "Electrolux", "Braun", "Samsung", "LG", "Gorenje", "Whirlpool", "Beko", "Haier"};

        for (int i = 0; i < arrayOfObjects.length; i++) {
            int randomSerialNumber = 1_000_000 + (int) (new Random().nextFloat() * (9_000_000 - 1_000_000));
            int randomTypeIndex = new Random().nextInt(typeArr.length);
            int randomModelIndex = new Random().nextInt(modelArr.length);
            int randomNameIndex = new Random().nextInt(nameArr.length);
            int randomCompanyIndex = new Random().nextInt(companyArr.length);
            int randomNumberLeft = (int) (new Random().nextFloat() * (100));
            float randomPrice = 5000 + new Random().nextFloat() * (25000 - 5000);
            Calendar randomProductionDate = new GregorianCalendar(2021, 1 + (int) (new Random().nextFloat() * (12 - 1)), 27 + (int) (new Random().nextFloat() * (1 - 27)));
            HouseholdAppliances object = new HouseholdAppliances(randomSerialNumber, typeArr[randomTypeIndex], modelArr[randomModelIndex], nameArr[randomNameIndex], companyArr[randomCompanyIndex], randomNumberLeft, randomPrice, randomProductionDate);
            arrayOfObjects[i] = object;
        }
        return arrayOfObjects;
    }

    public static void filterObjectsByType (HouseholdAppliances[] arrayOfObjects, String type) {
        for (HouseholdAppliances householdAppliances : arrayOfObjects) {
            if (householdAppliances.type.equals(type)) {
                System.out.println(householdAppliances);
            }
        }
    }

    public static void filterObjectsByPrice (HouseholdAppliances[] arrayOfObjects) {
        for (HouseholdAppliances householdAppliances : arrayOfObjects) {
            if (householdAppliances.price < 15000) {
                System.out.println(householdAppliances);
            }
        }
    }

    public static void filterObjectsByCompany (HouseholdAppliances[] arrayOfObjects, String company) {
        for (HouseholdAppliances householdAppliances : arrayOfObjects) {
            if (householdAppliances.company.equals(company)) {
                System.out.println(householdAppliances);
            }
        }
    }
}
