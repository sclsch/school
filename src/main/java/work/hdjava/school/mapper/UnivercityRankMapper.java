package work.hdjava.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import work.hdjava.school.domain.UnivercityRank;

/**
 * Author suncl
 * Date: 2022/10/4 11:19
 * Description:  该文件的描述
 */
@Mapper
public interface UnivercityRankMapper extends BaseMapper<UnivercityRank> {
    int insertSelective(UnivercityRank record);

    int updateByPrimaryKeySelective(UnivercityRank record);

    int updateBatch(List<UnivercityRank> list);

    int updateBatchSelective(List<UnivercityRank> list);

    int batchInsert(@Param("list") List<UnivercityRank> list);

    int insertOrUpdate(UnivercityRank record);

    int insertOrUpdateSelective(UnivercityRank record);
}