package ru.rwe.ru.rwe.employees.xml;

import org.w3c.dom.*;
import ru.rwe.employees.model.Employee;
import ru.rwe.employees.model.Salary;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private List<Employee> employeeList = new ArrayList<>();
    private org.w3c.dom.Document document;

    public Parser(XmlDocument xmlDocument){
        document = xmlDocument.getDocument();
        NodeList employeeNodeList = document.getElementsByTagName("employee");

        for(int i =0; i < employeeNodeList.getLength(); i++){
            if(employeeNodeList.item(i).getNodeType() == Node.ELEMENT_NODE){
                Element employeeElement = (Element) employeeNodeList.item(i);

                Element emploeesElement = (Element) document.getElementsByTagName("employees").item(0);

                Employee employee = new Employee();
                employee.setDepartment( emploeesElement.getAttribute("department") );
                employee.setNumber(Integer.valueOf(employeeElement.getAttribute("number")));

                NodeList childNodes = employeeElement.getChildNodes();
                for(int r =0; r< childNodes.getLength(); r++) {
                    if (childNodes.item(r).getNodeType() == Node.ELEMENT_NODE) {
                        Element childElement = (Element) childNodes.item(r);

                        switch (childElement.getNodeName()) {
                            case "name": {
                                employee.setName(childElement.getTextContent());
                            }
                            break;
                            case "age": {
                                employee.setAge(Integer.valueOf(childElement.getTextContent()));
                            }
                            break;
                            case "salary": {
                                Double value = Double.valueOf(childElement.getTextContent());
                                String currency = childElement.getAttribute("currency");
                                employee.setSalary(new Salary(value, currency));
                            }
                        }

                    }
                }

                employeeList.add(employee);

            }


        }
    }

    public List<Employee> getEmployeeList(){ return employeeList; }


}
