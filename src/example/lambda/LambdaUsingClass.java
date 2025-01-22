package example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaUsingClass {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmpId(1);
        emp.setEmpName("ABC");
        emp.setEmpSalary(10000);
        Employee emp1 =new Employee();
        emp1.setEmpId(2);
        emp1.setEmpName("PQR");
        emp1.setEmpSalary(200000);

        List<Employee> list=new ArrayList<>();
        list.add(emp);
        list.add(emp1);

        Collections.sort(list,(a,b)-> (int) (a.getEmpSalary()- b.getEmpSalary()));





    }
}
