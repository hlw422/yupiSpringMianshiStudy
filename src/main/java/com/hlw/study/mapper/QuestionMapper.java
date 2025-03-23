package com.hlw.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlw.study.model.entity.Question;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author hlw42
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-11-13 19:58:05
* @Entity generator.domain.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    @Select("SELECT * FROM question WHERE  update_time >= #{fiveMinutesAgoDate}")
    List<Question> listQuestionWithDelete(Date fiveMinutesAgoDate);
}




