package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.MemoDTO;
import mybatis.MybatisManager;

public class MemoDAO {
	private SqlSessionFactory ssf;
	
	public MemoDAO() {
		this.ssf = MybatisManager.getInstance();
	}

	public void insert(MemoDTO dto) {
		SqlSession ss = ssf.openSession(); 
		//SqlSession을 통해서 mapper에게 dto데이터 전달(mapper의 네임스페이스,id) *네임스페이스로 여러 mapper들을 구분
		ss.insert("boardMapper.input", dto);
		ss.commit();
	}

	public List<MemoDTO> selectAll() {
		SqlSession ss = ssf.openSession(); 
		return ss.selectList("boardMapper.listAll");
	}

}
