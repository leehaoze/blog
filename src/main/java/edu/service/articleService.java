package edu.service;

import java.util.List;

public interface articleService {

    /**
     * 获取所有文章的题目
     * @return 文章标题的List
     */
    public List<String> getAllTitles();


    /**
     * 根据ID获取标题
     * @param id 文章的id
     * @return 文章标题
     */
    public String getTitleById(Integer id);


    /**
     * 根据ID获取描述
     * @param id 文章id
     * @return 文章描述
     */
    public String getDescription(Integer id);

    public List getTitlesAndId();

}
