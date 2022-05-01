package com.JavaWebsite.dao;

import com.JavaWebsite.models.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class user_dao_imp implements user_dao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<user> getUser() {

        String query = "FROM user";
        return entityManager.createQuery(query).getResultList();
    }
}
