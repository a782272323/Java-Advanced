package learn.lhb.java.enum1.case01.commonlymethod;

/**
 * @Description  枚举的一般方法调用测试
 * @author Herbie Leung
 * @date 2020/7/13
 * @time 14:39
 */
public class Emun01Test {
    public static void main(String[] args) {
        //values 返回enum实例的数组
        for (Enum01 temp : Enum01.values()) {
            // name 返回实例enum声明的名字
            System.out.println(temp.name() + " 顺序是 " + temp.ordinal() + " ,相等的结果是 " +
                    Enum01.CRAWLING.equals(temp) + ",比较的结果是 " + Enum01.CRAWLING.compareTo(temp));
        }
        //由名称获取枚举类中定义的常量值
        System.out.println("由名称获取枚举类中定义的常量值 = " + Enum01.valueOf("CRAWLING"));
    }

}
