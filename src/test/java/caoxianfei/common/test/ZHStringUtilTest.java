/**
 * 
 */
package caoxianfei.common.test;

import org.junit.Test;

import com.caoxianfei.common.utils.ZHStringUtil;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年4月27日上午9:16:06
 */
public class ZHStringUtilTest {

	
	@Test
	public void test1() { 
		String zhString = ZHStringUtil.getZHString(6);    // 测试 随机生成5个 中文字符串
		System.out.println(zhString);
	}
	
	 
	@Test
	public void test2() {
		for (int i = 0; i < 10; i++) {
			String zhName = ZHStringUtil.getZHName();
			System.out.println(zhName);
		}
		
	}
	
}
