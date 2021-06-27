package by.tms.entity;

import java.util.Objects;

public class Operation {

    private double num1;
    private double num2;
    private String operation;
    private double result;
    private User user;

    public Operation(double num1, double num2, String operation, double result, User user) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.result = result;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operation='" + operation + '\'' +
                ", result=" + result +
                ", user=" + user +
                '}';
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation1 = (Operation) o;
        return Double.compare(operation1.num1, num1) == 0 && Double.compare(operation1.num2, num2) == 0 && Double.compare(operation1.result, result) == 0 && Objects.equals(operation, operation1.operation) && Objects.equals(user, operation1.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2, operation, result, user);
    }
}


