package org.serf.javacore.lesson_06;

public class HourlySalaryEmployee implements ISalary{

    private double workingHours;
    private double salaryPerHour;
    private double totalSalaryPerMonth;

    public HourlySalaryEmployee(double workingHours, double salaryPerHour) {
        this.workingHours = workingHours;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double salary() {
        return totalSalaryPerMonth =  workingHours * salaryPerHour;
    }

}
