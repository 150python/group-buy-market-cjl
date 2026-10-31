package cn.bugstack.domain.tag.service;

import cn.bugstack.domain.tag.adapter.repository.ITagRepository;
import cn.bugstack.domain.tag.model.entity.CrowdTagsJobEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @description
 * @create 2026/10/30 21:06
 */
@Service
@Slf4j
public class TagService implements ITagService{
    @Resource
    private ITagRepository repository;

    @Override
    public void execTagBatchJob(String tagId, String batchId) {
        //1.
        CrowdTagsJobEntity crowdTagsJobEntity = repository.queryCrowdTagsJobEntity(tagId, batchId);
        //2.采集用户数据
        List<String> userIdList = new ArrayList<String>(){
            {
                add("cjl");
                add("xh");
            }};
        for(String userId : userIdList){
            repository.addCrowdTagsUserId(tagId, userId);
        }

        // 更新人群标签统计量
        repository.updateCrowdTagsStatistics(tagId, userIdList.size());
    }

}
