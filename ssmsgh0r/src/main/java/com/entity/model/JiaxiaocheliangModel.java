package com.entity.model;

import com.entity.JiaxiaocheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 驾校车辆
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-22 15:32:18
 */
public class JiaxiaocheliangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车辆名称
	 */
	
	private String cheliangmingcheng;
		
	/**
	 * 车辆类型
	 */
	
	private String cheliangleixing;
		
	/**
	 * 车辆图片
	 */
	
	private String cheliangtupian;
		
	/**
	 * 车辆详情
	 */
	
	private String cheliangxiangqing;
		
	/**
	 * 车辆状态
	 */
	
	private String cheliangzhuangtai;
				
	
	/**
	 * 设置：车辆名称
	 */
	 
	public void setCheliangmingcheng(String cheliangmingcheng) {
		this.cheliangmingcheng = cheliangmingcheng;
	}
	
	/**
	 * 获取：车辆名称
	 */
	public String getCheliangmingcheng() {
		return cheliangmingcheng;
	}
				
	
	/**
	 * 设置：车辆类型
	 */
	 
	public void setCheliangleixing(String cheliangleixing) {
		this.cheliangleixing = cheliangleixing;
	}
	
	/**
	 * 获取：车辆类型
	 */
	public String getCheliangleixing() {
		return cheliangleixing;
	}
				
	
	/**
	 * 设置：车辆图片
	 */
	 
	public void setCheliangtupian(String cheliangtupian) {
		this.cheliangtupian = cheliangtupian;
	}
	
	/**
	 * 获取：车辆图片
	 */
	public String getCheliangtupian() {
		return cheliangtupian;
	}
				
	
	/**
	 * 设置：车辆详情
	 */
	 
	public void setCheliangxiangqing(String cheliangxiangqing) {
		this.cheliangxiangqing = cheliangxiangqing;
	}
	
	/**
	 * 获取：车辆详情
	 */
	public String getCheliangxiangqing() {
		return cheliangxiangqing;
	}
				
	
	/**
	 * 设置：车辆状态
	 */
	 
	public void setCheliangzhuangtai(String cheliangzhuangtai) {
		this.cheliangzhuangtai = cheliangzhuangtai;
	}
	
	/**
	 * 获取：车辆状态
	 */
	public String getCheliangzhuangtai() {
		return cheliangzhuangtai;
	}
			
}
