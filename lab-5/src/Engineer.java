class Engineer extends Employee {

    void drink() {
        System.out.println(getName() + " has drunk");
    }

    @Override
    void countSalary() {
        setSalary(getQuantity() * getRate());
    }
}
