class YoungEngineer extends Engineer {

    YoungEngineer() {
        setRate(getRate() / 2);
    }

    @Override
    void countSalary() {
        super.countSalary();
        super.drink();
    }
}
