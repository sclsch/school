package work.hdjava.school.controller;
import work.hdjava.school.domain.UnivercityRank;
import org.springframework.web.bind.annotation.*;
import work.hdjava.school.service.UnivercityRankService;

import javax.annotation.Resource;

/**
* (univercity_rank)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/univercity_rank")
public class UnivercityRankController {
/**
* 服务对象
*/
@Resource
private UnivercityRankService univercityRankService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
    @GetMapping("selectOne")
    public UnivercityRank selectOne(Integer id) {
        return univercityRankService.getById(id);
    }

}
