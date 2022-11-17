package composite;

public class Client {
    public static void main (String[] args){
        Developer dev1 = new Developer("name1", 200,"Junior");
        Developer dev2 = new Developer("name2", 222,"senior");

        Composite devEmployee = new Composite();
        devEmployee.addEmployee(dev1);
        devEmployee.addEmployee(dev2);

        Manager man1 = new Manager("manager1", 100,"SEO");
        Manager man2 = new Manager("manager2", 122,"SEO");

        Composite manEmployee = new Composite();
        manEmployee.addEmployee(man1);
        manEmployee.addEmployee(man2);

        Composite company = new Composite();
        company.addEmployee(devEmployee);
        company.addEmployee(manEmployee);
        company.showEmployeeDetails();

    }
}
