package com.JavaWebsite.dao;

import com.JavaWebsite.models.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class user_dao_imp implements user_dao{
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<user> getUser() {
        return null;
    }
}
