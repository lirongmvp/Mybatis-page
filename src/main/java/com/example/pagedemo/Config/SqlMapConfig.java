package com.example.pagedemo.Config;

import com.jolbox.bonecp.BoneCPDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author lirong
 * @create 2018/1/1
 * @since 1.0.0
 */
@Configuration
@PropertySource(value = {"classpath:jdbc.properties"})
public class SqlMapConfig extends SpringBootServletInitializer {

    @Autowired
    private DataSource dataSource;

    @Bean
    @ConditionalOnMissingBean //当容器里没有指定的Bean的情况下创建该对象
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 设置mybatis的主配置文件
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource mybatisConfigXml = resolver.getResource("classpath:mybatis/mybatis-config.xml");
        sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);
        // 设置别名包
        //sqlSessionFactoryBean.setTypeAliasesPackage("com.taotao.cart.pojo");

        return sqlSessionFactoryBean;
    }



}
