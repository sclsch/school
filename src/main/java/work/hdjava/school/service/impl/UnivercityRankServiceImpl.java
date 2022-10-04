package work.hdjava.school.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import work.hdjava.school.domain.UnivercityRank;
import work.hdjava.school.mapper.UnivercityRankMapper;
import work.hdjava.school.service.UnivercityRankService;

/**
 * Author suncl
 * Date: 2022/10/4 11:11
 * Description:  该文件的描述
 */
@Service
public class UnivercityRankServiceImpl extends ServiceImpl<UnivercityRankMapper, UnivercityRank> implements UnivercityRankService {

    @Override
    public int insertSelective(UnivercityRank record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(UnivercityRank record) {
        return baseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateBatch(List<UnivercityRank> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UnivercityRank> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UnivercityRank> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(UnivercityRank record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UnivercityRank record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

