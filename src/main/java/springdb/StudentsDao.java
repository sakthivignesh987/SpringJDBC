package springdb;

import springdatabase.*;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class StudentsDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void getPoints() {
		String sql = "select * from student";		
		List<Map<String,Object>> points = jdbcTemplate.queryForList(sql);
		System.out.println(points.get(1).get("name"));
	}
}
