package org.serf.javacore.lesson_06;

public class FixedSalaryEmployee implements ISalary{

    private double workingDays;
    private double salaryPerDay;
    private double totalSalaryPerMonth;

    public FixedSalaryEmployee(double workingDays, double salaryPerDay) {
        this.workingDays = workingDays;
        this.salaryPerDay = salaryPerDay;
    }

    @Override
    public double salary() {
        return totalSalaryPerMonth = workingDays * salaryPerDay;
    }

}
