package 匹配与查找;

import org.junit.Test;

import java.util.stream.Stream;

public class 匹配与查找 {
    @Test
    //allMatch 检查是否匹配所有元素
    public void Test01(){
        Stream<Integer> integerStream = Stream.of(10, 20, 30, 40, 50, 60);
//        boolean b = integerStream.allMatch(i -> i.equals(20));

        //findFirst : 返回第一个元素；
//        Optional<Integer> first = integerStream.findFirst();
//        System.out.println(first);

        //findAny : 返回当前流中的任意元素；
//        Optional<Integer> any = integerStream.findAny();
//        System.out.println(any);

        //count : 返回流中的总个数;
//        long count = integerStream.count();
//        System.out.println(count);




    }
}
