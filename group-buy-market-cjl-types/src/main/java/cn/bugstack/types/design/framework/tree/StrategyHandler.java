package cn.bugstack.types.design.framework.tree;

/**
 * @author Administrator
 * @description 策略处理器
 * @create 2026/10/19 19:11
 */
public interface StrategyHandler <T, D, R>{

    StrategyHandler DEFAULT = (t, d) -> null;

    R apply(T requestParameter, D dynamicContext) throws Exception;

}
