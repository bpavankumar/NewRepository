package com.spring.bean.injections.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("ConstructorBasedInjection")
public class ConstructorBeanInjectionService {
    private int articleId;
    private String articleName;
    private String articleDescription;
    private String articleType;
    private String intendedAudience;

    Logger logger = LoggerFactory.getLogger(ConstructorBeanInjectionService.class);

    public ConstructorBeanInjectionService() {

    }

    public ConstructorBeanInjectionService(int id, String name, String desc, String type, String aud) {
        this.articleId = id;
        this.articleName = name;
        this.articleDescription = desc;
        this.articleType = type;
        this.intendedAudience = aud;
    }

    public void getArticleRecord() {
	logger.info("Article Details being shown from the Constructor Based Spring Injection example:\n" 
			 + "\tArticle ID          : " + this.articleId + ",\n"
			 + "\tArticle Name        : " + this.articleName + ",\n"
			 + "\tArticle Description : " + this.articleDescription + ",\n"
			 + "\tArticle Type        : " + this.articleType + ",\n"
			 + "\tIntended Audience   : " + this.intendedAudience);
    }
}
