
/** 预先编译产生jar包
 * javac -d ./classes Hello.java
 * cd classes
 * jar cvf my-lib.jar com/
 */

 /**
 * javac -cp my-lib.jar:./ Test.java
 * java -cp my-lib.jar:./ Test
 * -cp会覆盖环境变量中设置的classpath
 */
import com.xy.test.Hello;  //加载jar包
import com.xy.home.Cat;   //依赖本地磁盘的Cat，编译依赖生成Cat.class字节码
public class Test{
   public static void main(String[] args) {
      Hello h = new Hello();
      h.sayHi();
      Cat cat = new Cat();
      cat.getName();

      System.out.println("I am Main Testing class");
   }
}