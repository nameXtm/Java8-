package 映射;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Test01 {
    @Test
    public void Test01(){
        //map 介绍一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成新的元素；
        List<String> strings = Arrays.asList("肖淑艳", "肖淑妍","肖书研","aa" );
        strings.stream().map(str -> str.toUpperCase(Locale.ROOT)).forEach(System.out::println);
    }
    @Test
    public void Test02(){
        //flatmap 接收一个函数作为参数，将流中的每个值都转换成另一个流，然后把所有流连成一个流；
        List<String> strings = Arrays.asList("肖淑艳", "肖淑妍","肖书研","aa" );
        Stream<Character> characterStream = strings.stream().flatMap(Test01::Test03);
        characterStream.forEach(System.out::println);

    }
    public static Stream<Character> Test03(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c :str.toCharArray()){
            list.add(c);
        }

        return list.stream();
    }

}
