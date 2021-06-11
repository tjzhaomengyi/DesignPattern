package java.com.mikemyzhao.SingletonPattern;

/**
 * @Author: zhaomengyi
 * @Date: 2021-06-11 16:08
 * @Description:多线程模式下的单例模式,这种方式是多线程中比较好的单例模式
 */
public class StaticSingleton {
  private StaticSingleton(){
    System.out.println("StaticSingleton is created");
  }

  //在初始的使用就创建了呀？
  private static class SingletonHolder{
    private static StaticSingleton instance = new StaticSingleton();
  }

  //答：并没有，这里调用getInstance()方法，才会创建内部类，调用上面的StringHolder方法来创建单例对象
  public static StaticSingleton getInstance(){
    return SingletonHolder.instance;
  }

}
