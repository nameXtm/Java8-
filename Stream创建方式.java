package StreamTest;

import org.junit.Test;
import 工具包.Employee;
import 工具包.MyEmployees;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream创建方式 {
    //方式一通过集合创建Stream;
    @Test
    public void Test01(){
        List<Employee> list = MyEmployees.getemployees();
        Stream<Employee> stream = list.stream();
        stream.forEach(System.out::println);

    }
    //方式二 通过数组创建Stream;
    @Test
    public void Test02(){
        Employee employee = new Employee("肖研",18);
        Employee employee1 = new Employee("肖书研",18);
        Employee[] epy = new Employee[]{employee,employee1};
        Stream<Employee> stream = Arrays.stream(epy);
        stream.forEach(System.out::println);


    }
    //方式三 通过Stream中of（）方法创建
    @Test
    public void Test03(){
        Stream.of("肖舒颜",18,"   ","肖淑妍", 18).forEach(System.out::print);
    }
    //方式四 创建Stream的无限流;
    @Test
    public void Test04(){
        //使用iterate 迭代 5个偶数; seed:起始位置
        Stream.iterate(2,t -> t+2).limit(5).forEach(System.out::println);
        System.out.println();
        //使用generate 生成 10个随机数
        Stream<Double> limit = Stream.generate(Math::random).limit(5);
        limit.forEach(System.out::println);



    }
}
