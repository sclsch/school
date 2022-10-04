package work.hdjava.school.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * Author suncl
 * Date: 2022/10/4 11:19
 * Description:  该文件的描述
 */
@TableName(value = "univercity_rank")
public class UnivercityRank {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 类型
     */
    @TableField(value = "`type`")
    private String type;

    /**
     * 得分
     */
    @TableField(value = "score")
    private String score;

    /**
     * 专业
     */
    @TableField(value = "majar")
    private String majar;

    /**
     * 年度
     */
    @TableField(value = "`year`")
    private String year;

    /**
     * 名次
     */
    @TableField(value = "`rank`")
    private Integer rank;

    /**
     * 学校名称
     */
    @TableField(value = "school")
    private String school;

    /**
     * 入库时间
     */
    @TableField(value = "op_date")
    private Date opDate;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取得分
     *
     * @return score - 得分
     */
    public String getScore() {
        return score;
    }

    /**
     * 设置得分
     *
     * @param score 得分
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * 获取专业
     *
     * @return majar - 专业
     */
    public String getMajar() {
        return majar;
    }

    /**
     * 设置专业
     *
     * @param majar 专业
     */
    public void setMajar(String majar) {
        this.majar = majar;
    }

    /**
     * 获取年度
     *
     * @return year - 年度
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年度
     *
     * @param year 年度
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取名次
     *
     * @return rank - 名次
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置名次
     *
     * @param rank 名次
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 获取学校名称
     *
     * @return school - 学校名称
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置学校名称
     *
     * @param school 学校名称
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取入库时间
     *
     * @return op_date - 入库时间
     */
    public Date getOpDate() {
        return opDate;
    }

    /**
     * 设置入库时间
     *
     * @param opDate 入库时间
     */
    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }
}