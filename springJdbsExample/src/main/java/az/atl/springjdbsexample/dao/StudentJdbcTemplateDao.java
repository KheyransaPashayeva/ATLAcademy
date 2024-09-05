package az.atl.springjdbsexample.dao;

import az.atl.springjdbsexample.model.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
@Repository
public class StudentJdbcTemplateDao implements StudentDao<Student> {
    private static final String FIND_BY_ID="SELECT * FROM students WHERE id=?;";
    private final String SQL_DELETE_STUDENT = "delete from students where id = ?";
    private final String SQL_UPDATE_STUDENT = "update students set name = ?, surname = ?, age  = ? where id = ?";
    private final String SQL_GET_ALL = "select * from students";
    private final String SQL_INSERT_STUDENT = "insert into students(id, name, surname, age) values(?,?,?,?)";

    private JdbcTemplate jdbcTemplate;
    public StudentJdbcTemplateDao(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }
    @Override
    public Optional<Student> findById(Long id) {
       return Optional.of(jdbcTemplate.queryForObject(FIND_BY_ID,new Object[]{id}, new RowMapper<Student>() {
           @Override
           public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
               Student student=new Student();
               student.setId(rs.getLong("id"));
               student.setName(rs.getString("name"));
               student.setSurname(rs.getString("surname"));
               student.setAge(rs.getInt("age"));
               return student;
           }
       }));
    }


    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query(SQL_GET_ALL, BeanPropertyRowMapper.newInstance(Student.class));
    }
    public void save(Student student) {
         jdbcTemplate.update(SQL_INSERT_STUDENT,
                new Object[] { student.getName(), student.getSurname(), student.getAge() });
    }

    @Override
    public void update(Student student) {
       jdbcTemplate.update(SQL_UPDATE_STUDENT,
                new Object[] { student.getId(), student.getName(), student.getSurname(), student.getAge() });
    }
    @Override
    public int deleteById(Long id) {

        return jdbcTemplate.update(SQL_DELETE_STUDENT, id);
    }

}
