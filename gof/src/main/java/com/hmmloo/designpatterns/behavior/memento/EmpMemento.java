package com.hmmloo.designpatterns.behavior.memento;

public class EmpMemento {
    private final int empId;
    private final String empName;
    private final String empPhoneNo;
    private final String empDesignation;

    public EmpMemento(int empId, String empName, String empPhoneNo, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    @Override
    public String toString() {
        return "EmpMemento{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empPhoneNo='" + empPhoneNo + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }
}
