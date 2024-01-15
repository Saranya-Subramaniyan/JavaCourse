package com.springHibernate.SpringHibernateApp.jdbcPerson;

import com.springHibernate.SpringHibernateApp.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate template;
    class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person=new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirth_date(rs.getTimestamp("birth_date"));
            return person;
        }
    }

    public List<Person> findAll() {
        String sql="select * from person";
        List<Person> person= template.query(sql,new PersonRowMapper());
//        return (person!=null)?person:new ArrayList<Person>();
        return person;

    }
    public Person findById(int id){
        return  template.queryForObject("select * from person where id=?",new Object[]{id},new PersonRowMapper());
    }
    public List<Person> findByName(String name){
        return  template.query("select * from person where name=?",new Object[]{name},new PersonRowMapper());
    }
    public int deleteById(int id){
        return  template.update("delete from person where id=?",new Object[]{ id });
    }
    public int deleteByIdAndName(int id,String name){
        return  template.update("delete from person where id=? and name=?",new Object[]{ id,name });
    }

    public int insert(Person person){
        return template.update("insert into person(id,name,location,birth_date) values(?,?,?,?)",new Object[]{person.getId(),person.getName(),person.getLocation(),new Timestamp(person.getBirth_date().getTime())});
    }
    public int update(Person person){
        return template.update("update person set name=?,location=?,birth_date=? where id=?",new Object[]{person.getName(),person.getLocation(),new Timestamp(person.getBirth_date().getTime()),person.getId()});
    }
}
