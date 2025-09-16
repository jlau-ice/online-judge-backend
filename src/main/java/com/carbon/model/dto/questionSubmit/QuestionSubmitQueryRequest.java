package com.carbon.model.dto.questionSubmit;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionSubmitQueryRequest implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 编程语言
     */
    private String language;

    /**
     * 提交状态
     */
    private Integer status;


    /**
     * 题目 id
     */
    private Long questionId;
    /**
     * 用户 id
     */
    private Long userId;


}
