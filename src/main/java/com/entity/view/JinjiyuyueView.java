package com.entity.view;

import com.entity.JinjiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 紧急预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-24 10:50:22
 */
@TableName("jinjiyuyue")
public class JinjiyuyueView  extends JinjiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinjiyuyueView(){
	}
 
 	public JinjiyuyueView(JinjiyuyueEntity jinjiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, jinjiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
