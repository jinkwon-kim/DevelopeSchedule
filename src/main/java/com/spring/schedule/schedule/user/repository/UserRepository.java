package com.spring.schedule.schedule.user.repository;

import com.spring.schedule.schedule.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    default User findByIdOrElseThrow(Long userid) {
        return findById(userid).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist userid =" + userid));
    }
}
