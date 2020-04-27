/**
 * 
 */
package caoxianfei.common.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.caoxianfei.common.utils.RandNumUtil;
import com.caoxianfei.common.utils.ZHStringUtil;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年4月27日上午9:54:19
 */
public class TestEnd {

	
	@Test
	public void test() {
		int id = 0; 
		for (int i = 0; i < 100; i++) {
			String zhName = ZHStringUtil.getZHName();
			int age = RandNumUtil.random(1, 100);
			double value = RandNumUtil.getValue(30000, 80000, 2);
			int year = RandNumUtil.random(2012, 2020 + 1);
			int day = 0 ;
			int month = 0 ;
			if(year == 2020) {                             //由规定可得 如想要得到2020 年的话   必须 输入 2020 + 1 的数值 由前提限定 1-3 范围 只能得到 1 或 2  
				month = RandNumUtil.random(1 , 4 + 1 );  // 所以 输入的参数 最大值 必须要 加 1
				day = RandNumUtil.random(1, 27 + 1 );
			}else {
				month = RandNumUtil.random(1,12 );
				day = RandNumUtil.random(1,30 );
			}
			
			String date = year + "-" + month + "-" + day;      //  总的测试方法 生成一百个对象信息
			Date date1 = null;
			try { 
				date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			id++;
			
			Person p = new Person();
			p.setId(BigInteger.valueOf(id));
			p.setName(zhName);
			p.setAge(age);
			p.setScope(BigDecimal.valueOf(value));
			p.setDate(date1);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(p + " date=" + sdf.format(p.getDate()));
		}
	}
	
}
