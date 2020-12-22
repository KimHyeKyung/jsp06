package mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisManager {
	
	//객체를 하나만 만들고 실행되도록 구현합시다.
	private static SqlSessionFactory sqlSessionFactory=null;

	//private생성자를 통해서 객체생성 불가(외부에서 접근 불가)
	private MybatisManager() {
	}
	
	//static way로 접근가능한 메서드에서 SqlSessionFactory객체 생성
	public static SqlSessionFactory getInstance() {
		
		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(sqlSessionFactory == null) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}
		return sqlSessionFactory;
	}
}
