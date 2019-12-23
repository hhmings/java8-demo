1.1 流处理
    流是一系列数据项，一次只生成一项。
    并行

1.2 谓词 （Predicate）

1.4 默认方法


3 Lambda

    （1）Lambda 基本语法：

        (parameters) -> expression

        或者

        (parameters) -> {expression}


    （2）Lambda 表达式由参数、箭头和主体组成

        (Apple apple1, Apple apple2)  ->    apple1.getWeight().compareTo(apple2.getWeight());
        |            参数          |  箭头   |                主体                           |


    (3) 有效的 Lambda 表达式

        (String s) -> s.length()  // 返回一个 int，隐含return

        (Apple a) -> a.getWeight() > 100  // 返回 boolean

        (int x, int y) -> {                     //没有返回值

            System.out.println("result:");
            System.out.println(x+y);
        }

        () -> 42   // 返回一个 int

        (Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight())  // 返回一个 int



    (4) Lambda 示例

        布尔表达式                        (List<String> list) -> list.isEmpty()

        创建对象                          () -> new Apple("red",100)

        消费一个对象                       (Apple a) -> {

                                              System.out.println(a.getWeight());
                                          }

        从一个对象中选择/抽取               (String s) -> s.length()

        组合两个值                         (int a,int b) -> a*b

        比较两个对象                       (Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight())



3.4 函数式接口

3.4.1 Predicate


3.4.1 Consumer














