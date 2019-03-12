class Racer extends Employee {

    Racer() {
        setRate(2);
    }

    @Override
    void countSalary() {
        setSalary(getQuantity() * getRate());
    }

}
