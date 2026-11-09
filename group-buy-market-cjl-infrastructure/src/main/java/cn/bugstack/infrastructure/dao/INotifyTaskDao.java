package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.NotifyTask;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description
 * @create 2026/11/9 20:02
 */
@Mapper
public interface INotifyTaskDao {
    void insert(NotifyTask notifyTask);
}
