package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {


        String[] allnames = {"Claus", "Tove", "Anna", "Henning", "Morten", "Martin", "MArtina", "Marcel"};

        int[] allcprs = {221175, 130195, 150970, 150970, 150970, 150970, 150970, 150970};
        List<Members> allmembers = new ArrayList<>();


        String[] employeesnames = {"Claus", "Anna", "Tove", "Henning"};

        int[] employeescpr = {221175, 130195, 150970, 150970};

        int[] hours = {37, 37, 20, 15};
        int[] salary = {23000, 23000, 9120, 6840};


        List<Members> membertype = new ArrayList<>();


        for (int i = 0; i < 2; i++) {

            membertype.add(i, new Employee(employeesnames[i], hours[i], employeescpr[i], salary[i]));
            //place rest of code here
        }

        for (int i = 2; i < 4; i++) {
            membertype.add(i, new Instructors(employeesnames[i], hours[i], employeescpr[i], salary[i]));

            //place rest of code here
        }


        System.out.println("FITNESS MEMBERS");
        System.out.println("*****************************************");

        String[] names = {"Morten", "Martin", "Martina", "Marcel"};
        int[] cpr = {130195, 221175, 150970, 221175};
        System.out.println("Name: " + "   " + "Cpr" + "    Fee" + "      Member type");
        for (int i = 0; i < 2; i++) {

            membertype.add(i, new Basic(names[i], cpr[i]));
            //place rest of code here
        }

        for (int i = 2; i < 4; i++) {
            membertype.add(i, new Full(names[i], cpr[i]));

            //place rest of code here
        }

        for (Members mt : membertype) {

            if (mt instanceof Full) {


                ((Full) mt).setFee(299);
                ((Full) mt).setTypename("Full");
                System.out.println((mt.getName()) + "  " + mt.getCpr() + "  " + (mt.getFee()) + "      " + (mt.getTypename()));

            }

            if (mt instanceof Basic) {


                ((Basic) mt).setFee(199);
                ((Basic) mt).setTypename("Basic");
                System.out.println((mt.getName()) + "  " + mt.getCpr() + "  " + (mt.getFee()) + "      " + (mt.getTypename()));

            }


        }


        System.out.println("*****************************************");


        System.out.println("FITNESS EMPLOYEES");

        System.out.println("*****************************************");
        System.out.println("Name: " + "   " + "Cpr" + "    hours" + "      salary" + "    vacation");


        List<Members> employeetype = new ArrayList<>();


        for (int i = 0; i < 2; i++) {

            employeetype.add(i, new Employee(employeesnames[i], hours[i], employeescpr[i], salary[i]));
            //place rest of code here
        }

        for (int i = 2; i < 4; i++) {
            employeetype.add(i, new Instructors(employeesnames[i], hours[i], employeescpr[i], salary[i]));

            //place rest of code here
        }

        for (Members mt : employeetype) {

            if (mt instanceof Employee) {
                mt.setVacation(5);
                System.out.println((mt.getName()) + "  " + mt.getCpr() + "   " + mt.getHours() + "          " + mt.getSalary() + "        " + mt.getVacation());

            }

            if (mt instanceof Instructors) {


                System.out.println((mt.getName()) + "  " + mt.getCpr() + "   " + mt.getHours() + "          " + mt.getSalary());

            }

        }
        System.out.println("*****************************************");
        System.out.println("EMPLOYEESS & MEMBERS Name and cpr ");
        System.out.println("NAME" + "   CPR");

        for (int i = 0; i < 8; i++) {

            allmembers.add(i, new Members(allnames[i], 0, allcprs[i], 0));


        }

        for (Members mt : allmembers) {

            if (mt instanceof Members) {

                System.out.println((mt.getName()) + "  " + mt.getCpr());

            }


        }


    }
}
