## 正则表达式（Regular Expression）

#### 字符集描述

| 名称       | 记法                       | 举例       |
| ---------- | -------------------------- | ---------- |
| 通配符     | .                          | A.B        |
| 指定的集合 | 包含在 [] 中               | [AEIOU]*   |
| 集合范围   | 包含在 [] 中，由 "-"  分隔 | [A-Z][0-9] |
| 补集       | 包含在 [] 中，首字母为 "^" | [^AEIOU]*  |

#### 必包缩写

| 选项               | 记法         | 举例      |
| ------------------ | ------------ | --------- |
| 至少重复一次       | +            | (AB)+     |
| 重复 0 次或者 1 次 | ？           | (AB)?     |
| 重复指定次数       | {}中指定次数 | (AB){3}   |
| 指定重复的范围     | {}中指定范围 | (AB){1-2} |

#### 转义序列

某些字符，如"\\"、"."、"|"、"*"、"+"、"(" 、")"等，需要  "\\" 加以区分。在 Java 中，以 "\\\\" 表示转义。

####实际应用

* 学习网站
  * <a href="https://www.debuggex.com/#cheatsheet">Debuggex</a>
  * <a href="https://blog.csdn.net/onebigday/article/details/5429868">常用等正则表达式大全</a>

* 非确定有限状态自动机
  * 能将正则转化为 DFA
  * 图形界面  [TODO]

#### Java中的用法

java.util.regex 包主要包括以下三个类：

- Pattern 类：

  pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。

- Matcher 类：

  Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。

- PatternSyntaxException：

  PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。

  ```java 
  import java.util.regex.Matcher;
  import java.util.regex.Pattern;
   
  public class RegexMatches
  {
      private static final String REGEX = "\\bcat\\b";
      private static final String INPUT =
                                      "cat cat cat cattie cat";
   
      public static void main( String args[] ){
         Pattern p = Pattern.compile(REGEX);
         Matcher m = p.matcher(INPUT); // 获取 matcher 对象
         int count = 0;
   
         while(m.find()) {
           count++;
           System.out.println("Match number "+count);
           System.out.println("start(): "+m.start());
           System.out.println("end(): "+m.end());
           System.out.println("end(): "+m.group());
        }
     }
  }
  ```