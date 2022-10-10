package com.abdou.security.service.impl;

import com.abdou.security.model.Role;
import com.abdou.security.repository.RoleRepository;
import com.abdou.security.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    @Override
    public Role saveRole(Role role) {
        System.out.println(role.getName());
        return roleRepository.save(role);
    }
}
