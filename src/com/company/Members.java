package com.company;

public class Members {





public String typename;
    public int fee;

    // field el. data


public String name;
public int cpr;
public int salary;
public int hours;
public int vacation;


    public Members (String Membername, int cprnumber) {
        name = Membername;
        cpr = cprnumber;
    }


    public Members(String employeesnames, int h1, int i, int i1) {
        name = employeesnames;
        cpr = i;
        salary = i1;
        hours = h1;

    }


    // getter & setters

    public void setTypename(String typename) {
        // giver navn
        this.typename = typename;
    }

    public String getTypename() {
        return typename;
    }

    public int getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public void setVacation(int vacation) {
        // giver navn
        this.vacation = vacation;
    }

    public int getVacation () {

        return vacation;
    }



    public void setName(String name) {
        // giver navn
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getCpr() {
        return cpr;
    }


    public void setFee(int fee) {
        // giver navn
        this.fee = fee;
    }
    public int getFee() {
        return fee;
    }






}
