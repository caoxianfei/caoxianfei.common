/**
 * 
 */
package caoxianfei.common.test;

import org.junit.Test;

import com.caoxianfei.common.utils.RandNumUtil;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年4月27日上午8:48:53
 */
public class RandNumUtilTest {

	@Test 
	public void test1() {
		System.out.println(RandNumUtil.getValue(25400.56, 67078.94, 2));  //输入两个  浮点型的 小数   以及一个 小数位数限定 
	}
	 
	
	@Test
	public void test2() {
		System.out.println(RandNumUtil.random(1, 3));    //输入 min - max 范围  得到   min 到 max -1  的随机值
	}
	
}
