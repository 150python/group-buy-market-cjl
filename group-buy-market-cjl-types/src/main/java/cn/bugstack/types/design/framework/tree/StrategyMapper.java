package cn.bugstack.types.design.framework.tree;

/**
 * @author Administrator
 * @description 策略映射器
 * @create 2026/10/19 19:10
 */
public interface StrategyMapper<T, D, R>{
    StrategyHandler<T, D, R> get(T requestParameter, D dynamicContext) throws Exception;
}
