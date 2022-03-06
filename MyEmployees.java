package 工具包;

import java.util.ArrayList;
import java.util.List;

public  class  MyEmployees {
    public static   List<Employee>  getemployees(){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1001,"肖扬",21,9800,"鞠婧祎"));
        list.add(new Employee(1002,"马云",16,1,"赵丽颖"));
        list.add(new Employee(1003,"马化腾",28,800,"苍老师"));
        list.add(new Employee(1004,"刘东强",38,900,"波老师"));
        list.add(new Employee(1005,"Tom",25,10000,"王靖雯"));
        list.add(new Employee(1006,"雷军",48,500,"迪丽热巴"));
        list.add(new Employee(1007,"比尔盖茨",56,900,"杨幂"));
        list.add(new Employee(1008,"古力娜扎",18,19800,"肖扬"));


        return list ;
    }
}
