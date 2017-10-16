package id.barangka.soeru.repository;

import id.barangka.soeru.dao.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    List<User> findAllByPrivilege(@Param("privilege") Character privilege);
}
