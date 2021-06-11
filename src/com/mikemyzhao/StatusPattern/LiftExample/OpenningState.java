package com.mikemyzhao.StatusPattern.LiftExample;

/**
 * openstate状态是由open()方法产生的，因此在这个方法中有一个具体的业务逻辑，在open状态下能过度到其他状态
 * 按照现在的定义的是只能过度到closingState状态，因此我们在close()中定义了状态变化，同时把close这个动作
 * 委托给了CloseState类下的close方法
 */
public class OpenningState extends LiftState {
    //打开电梯门
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.closingState);
        //动作委托为CloseState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        //do nothing
    }

    @Override
    public void stop() {
        //do nothing
    }
}
