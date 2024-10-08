package ru.kata.spring.boot_security.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.models.Role;

import java.util.List;

@Service
@Transactional(readOnly = true)
public interface RoleService {

    Role findByName(String name);

    List<Role> findAll();

    Role findOne(int id);

    @Transactional
    void save(Role user);

    @Transactional
    void update(int id, Role updatedRole);

    @Transactional
    void delete(int id);

}
