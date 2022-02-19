package ru.rwe;


import ru.rwe.employees.model.Employee;
import ru.rwe.ru.rwe.employees.xml.XmlDocument;
import ru.rwe.ru.rwe.employees.xml.Parser;
import ru.rwe.ru.rwe.employees.xml.XmlFile;

import java.util.List;

public class Main {

    public static void main(String[] args){
        XmlFile file = new XmlFile("simple.xml");
        XmlDocument document  = new XmlDocument(file);
        List<Employee> employeeList = new Parser(document).getEmployeeList();

        employeeList.forEach(System.out::println);

    }
}
