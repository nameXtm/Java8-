package 收集;

import org.junit.Test;
import 工具包.Employee;
import 工具包.MyEmployees;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {
    @Test
    public void Test01(){
        // 收集 : collect : 将流转换为其他类型，接受一个collector接口的实现，用于给Stream做汇总的方法;
        Stream<Employee> stream = MyEmployees.getemployees().stream();
        List<Employee> collect = stream.filter(e -> e.getWage() > 6000).collect(Collectors.toList());
        collect.forEach(System.out::println);
        //注 : Collectors的方法与返回类型为to***;


    }
}
