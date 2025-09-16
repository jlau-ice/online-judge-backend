package com.carbon.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.carbon.model.dto.question.QuestionQueryRequest;
import com.carbon.model.entity.Question;
import com.baomidou.mybatisplus.extension.service.IService;
import com.carbon.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
public interface QuestionService extends IService<Question> {



}
