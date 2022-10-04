package work.hdjava.school.service;

import java.util.List;
import work.hdjava.school.domain.UnivercityRank;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * Author suncl
 * Date: 2022/10/4 11:11
 * Description:  该文件的描述
 */
public interface UnivercityRankService extends IService<UnivercityRank> {


    int insertSelective(UnivercityRank record);

    int updateByPrimaryKeySelective(UnivercityRank record);

    int updateBatch(List<UnivercityRank> list);

    int updateBatchSelective(List<UnivercityRank> list);

    int batchInsert(List<UnivercityRank> list);

    int insertOrUpdate(UnivercityRank record);

    int insertOrUpdateSelective(UnivercityRank record);

}

