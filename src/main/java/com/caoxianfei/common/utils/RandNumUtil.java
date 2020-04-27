/**
 * 
 */
package com.caoxianfei.common.utils;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年4月27日上午8:42:40
 *	随机数工具类
 */
public final class RandNumUtil {
	
	/**
	 * 获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87
	 *	 功能: 
	 *	@return :
	 *
	 */
	
	public static double getValue(final double min, final double max,final int scale){
		//TODO 实现代码
		Random rand =new Random();
		double  value = rand.nextDouble()*(max - min) + min;	
		BigDecimal value2 = new BigDecimal(value).setScale(scale, 2);   //随机生成以为精度 min-max范围内 16位的小数 后限定其位数为 小数后两位
		double doubleValue = value2.doubleValue();
		return doubleValue;
	} 
	
	/** 
	 * 	方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值
	 *	 功能: 生成指定范围间的随机整数
	 *	@return :
	 *
	 */
	public static int random(int min, int max){
		//TODO 实现代码
			int nextInt = ThreadLocalRandom.current().nextInt(min, max );    //    指定范围内随机成成一个 随机数 不包括 max
			return nextInt;
		}
	
}
