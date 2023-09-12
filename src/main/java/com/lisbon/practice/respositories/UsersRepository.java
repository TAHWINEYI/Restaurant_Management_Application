package com.lisbon.practice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lisbon.practice.model.USERS;

@Repository
public interface UsersRepository extends JpaRepository<USERS, Long> {

}
