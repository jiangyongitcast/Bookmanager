package demo01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    enum Size {S, M, L}

    ;

    public static void main(String[] args) throws IOException {

        System.out.println("HelloWorld!");
//        test01();
//        test02();
//        test03();
//        test04();
//        test06();
//        test07();

        test08();

    }

    public static void test01() {
        int a = 10;
        double b = 20.0;
        System.out.println(a + b);
    }
//    常用数学函数
    public static void test02() {
        int a = 10;
        int b = 3;
        System.out.println(10 % 3);
        System.out.println(Math.sqrt(b + 1));
        System.out.println(Math.pow(a, 3));
        System.out.println(Math.round(3.14));
        System.out.println(Math.abs(-3));
    }
//    关系运算符和逻辑运算符
    public static void test03() {
        int a = 1;
        int b = 0;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a > b && a != b) {
            System.out.println("a>b");
        }
    }
//    位运算符
    public static void test04() {
        int a = -1;
        int b = 0;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a << 1);//2^1=2
        System.out.println(a << 31);
        System.out.println(a << 32);
        System.out.println(a << 33);
        System.out.println(a << 34);
        System.out.println(a << 34);
        System.out.println(a >> 1);

    }
//    枚举
    public static void test05() {
        Size s = Size.S;
    }
//    字符串的方法
    public static void test06() {
        String name = "Duck";
//        String name2 = "Du"+"ck";
        String name2 = new String("Duck");
        System.out.println(name.substring(2));
        if (name == name2) {
            System.out.println("==名字相同");
        }
        if (name.equals(name2)) {
            System.out.println("equals名字相同");
        }
        String s = "ABCDE";
//        System.out.println(s.codePoints());
        System.out.println(s.codePointAt(0));
        System.out.println(s.codePointBefore(1));
        System.out.println(s.codePointCount(0, 3));

        StringBuilder sb = new StringBuilder("Apple");
        System.out.println(sb);
        sb.append(" mini5");
        System.out.println(sb);
    }
//    基本输入和输出
    public static void test07() throws IOException {
//        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextLine());
        String name = "Duck";
        int age = 2;
        System.out.printf("My name is %s, I am %d years old.", name, age);
        System.out.println();
//        PrintWriter writer = new PrintWriter("./hello.txt", "UTF-8");
//        writer.write("hello");
//        writer.println("hello");
        Scanner in = new Scanner(Paths.get("./hello.txt"), "UTF-8");
        System.out.println(in.nextLine());
    }
//    数组及排序
    public static void test08() {
        int[] scores = new int[10];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (Math.random() * 100);
        }
        for (int e : scores)
            System.out.println(e);
//        System.out.println(scores.length);
        Arrays.sort(scores);
        for (int e :
                scores) {
            System.out.println(e);
        }
    }
}

/*
 * 1、一个简单的java应用程序
 * 2、注释
 *
 *
 * 3、数据类型
 * 整形    字节 取值范围
 * int       4   -2^16~2^16
 * short     2
 * long
 * byte
 * 浮点型      字节      范围      默认
 * float        4                   否
 * double       8                   是
 * 字符型
 * char
 * boolean类型
 * false
 * true
 *
 *
 * 4、变量
 * 命名规则：标识符
 * 初始化
 * 常量
 * final关键字表示常量
 *
 *
 * 5、运算符
 * 5.1 算数运算符
 * 5.2 数学函数与常量 sqrt pow
 * 5.3 数值类型转换
 * 5.4 复合赋值运算符
 * 5.5 自增运算符
 * 5.6 关系运算符逻辑运算符
 * 5.6 位运算符
 * 5.7 运算符和优先级
 * 5.8 枚举类型
 *
 *
 *
 * 6、字符串
 * 6.1 子串
 * 6.2  拼接
 * 6.3  相等比较
 * 6.4  空串和NUll串
 * 6.5  码点和代码单元
 * 6.6  String API （50多个方法）
 * 6.7 StringBuilder
 *
 *
 * 7、输入输出
 * 7.1 Scanner
 * 7.2 printf
 * 7.3 文件输入与输出
 *
 *
 * 8、控制流
 * 8.1 语句块
 * 8.2 条件语句
 * 8.3 循环
 * 8.4 for循环
 * 8.5 switch语句
 * 8.6 break和continue
 *
 *
 * 9、大数值
 *
 *
 * 10、数组
 * 10.0 声明、创建、赋值、取值
 * 10.1 foreach循环
 * 10.2 初始化及匿名数组
 * 10.3 数组拷贝
 * 10.4 命令行参数
 * 10.5 数组排序
 * 10.6 多维数组
 *
 *
 */
