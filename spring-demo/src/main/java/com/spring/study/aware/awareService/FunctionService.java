package com.spring.study.aware.awareService;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;


/**
 * Created by shibiao on 2017/11/6.
 */
/**
 *
 * 通过实现BeanNameAware可以获取beanName
 * 通过实现ResourceLoaderAware可以获取ResourceLoader来加载外部资源文件
 */
@Component
public class FunctionService implements BeanNameAware,ResourceLoaderAware {
    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outPut(){
        System.out.println("bean name is" + beanName);
        Resource resource = resourceLoader.getResource("classpath:properties/test.properties");
        try{
            System.out.println(IOUtils.toString(resource.getInputStream()));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
