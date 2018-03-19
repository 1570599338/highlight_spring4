package com.lquan.bean;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

public class AplicationContentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext application = new ApplicationContext() {
			
			@Override
			public Resource getResource(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ClassLoader getClassLoader() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Resource[] getResources(String arg0) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void publishEvent(ApplicationEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getMessage(String arg0, Object[] arg1, String arg2, Locale arg3) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getMessage(String arg0, Object[] arg1, Locale arg2) throws NoSuchMessageException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getMessage(MessageSourceResolvable arg0, Locale arg1) throws NoSuchMessageException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BeanFactory getParentBeanFactory() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsLocalBean(String arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isTypeMatch(String arg0, Class<?> arg1) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isSingleton(String arg0) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isPrototype(String arg0) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Class<?> getType(String arg0) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T getBean(Class<T> arg0, Object... arg1) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getBean(String arg0, Object... arg1) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T getBean(String arg0, Class<T> arg1) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T getBean(Class<T> arg0) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getBean(String arg0) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getAliases(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsBean(String arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> arg0) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> Map<String, T> getBeansOfType(Class<T> arg0, boolean arg1, boolean arg2) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> Map<String, T> getBeansOfType(Class<T> arg0) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getBeanNamesForType(Class<?> arg0, boolean arg1, boolean arg2) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getBeanNamesForType(Class<?> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getBeanNamesForAnnotation(Class<? extends Annotation> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getBeanDefinitionNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getBeanDefinitionCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public <A extends Annotation> A findAnnotationOnBean(String arg0, Class<A> arg1)
					throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsBeanDefinition(String arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Environment getEnvironment() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getStartupDate() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ApplicationContext getParent() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getDisplayName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getApplicationName() {
				// TODO Auto-generated method stub
				return null;
			}
		};

	}

}
