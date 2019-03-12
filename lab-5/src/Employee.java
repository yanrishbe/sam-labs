abstract class Employee {
    private String name;
    private double percent = 0.13;
    private double salary = 0;

    /**
     * field rate has this value by default and can be changed with setRate
     */
    private double rate = 1.5;

    /**
     * amount of races or working hours
     */
    private int quantity;

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    double getRate() {
        return rate;
    }

    void setRate(double rate) {
        this.rate = rate;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setPercent(double percent) {
        this.percent = percent;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Name: " + name);
    }

    abstract void countSalary();

    double taxCounter() {
        if(salary == 0){
            System.out.println("The salary hasn't been counted yet. Please count salary first");
        }
       return salary * percent;
    }
}
