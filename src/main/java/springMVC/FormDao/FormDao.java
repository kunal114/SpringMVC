package springMVC.FormDao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import springMVC.model.User;

@Repository
@Component("formDao")
public class FormDao implements FormDaoInt {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addUser(User user) {
        String query = "insert into User(email,name,password) values(?,?,?)";
        this.jdbcTemplate.update(query,user.getEmail(),user.getName(),user.getPassword());
    }

}
