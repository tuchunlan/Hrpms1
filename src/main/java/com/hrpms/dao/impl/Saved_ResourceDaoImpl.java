package com.hrpms.dao.impl;

import com.hrpms.dao.Saved_ResourceDao;
import com.hrpms.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class Saved_ResourceDaoImpl implements Saved_ResourceDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> selectCustomer(Map map) {
        Session session = sessionFactory.getCurrentSession();
        StringBuffer stringBuffer=new StringBuffer("from Customer where 1=1");
        if(map.get("name")!=null && !"".equals(map.get("name"))){
            map.put("name","%"+map.get("name")+"%");
            stringBuffer.append(" and name like :name");
        }
        if(map.get("idCard")!=null && !"".equals(map.get("idCard"))){
            stringBuffer.append(" and idCard like :idCard");
        }
        if(map.get("maxage")!=null && !"".equals(map.get("maxage"))){
            stringBuffer.append(" and age<= :maxage");
        }
        List<Customer> list = session.createQuery(stringBuffer.toString())
                .setFirstResult((int) map.get("startIndex"))
                .setMaxResults((int) map.get("pageSize"))
                .setProperties(map)
                .list();
        return list;
    }

    @Override
    public long count(Map map) {
        return 0;
    }
}
