package com.spring.bean.injections.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("SetterBasedInjection")
public class SetterBeanInjectionService {
    private int articleId;
    private String articleName;
    private String articleDescription;
    private String articleType;
    private String intendedAudience;

    Logger logger = LoggerFactory.getLogger(SetterBeanInjectionService.class);
    
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getIntendedAudience() {
        return intendedAudience;
    }

    public void setIntendedAudience(String intendedAudience) {
        this.intendedAudience = intendedAudience;
    }

    public void getArticleRecord() {
	logger.info("Article Details being shown from the Setter/Getter Based Spring Injection example:\n" 
			 + "\tArticle ID          : " + this.getArticleId() + ",\n"
			 + "\tArticle Name        : " + this.getArticleName() + ",\n"
			 + "\tArticle Description : " + this.getArticleDescription() + ",\n"
			 + "\tArticle Type        : " + this.getArticleType() + ",\n"
			 + "\tIntended Audience   : " + this.getIntendedAudience());
    }
}