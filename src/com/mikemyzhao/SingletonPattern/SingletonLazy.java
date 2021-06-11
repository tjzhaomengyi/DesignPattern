package java.com.mikemyzhao.SingletonPattern;

/**
 * @Author: zhaomengyi
 * @Date: 2021-06-11 16:22
 * @Description:延迟加载的单例，只有在使用的时候才会创建
 */
public class SingletonLazy {
  private SingletonLazy(){
    System.out.println("LazySingleton is create");
  }
  private static SingletonLazy instance = null;
  public static synchronized SingletonLazy getInstance(){
    if(instance == null){
      instance = new SingletonLazy();
    }
    return instance;
  }
}
