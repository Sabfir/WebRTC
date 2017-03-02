package com.softserve.webrtc.dao;

import com.softserve.webrtc.model.Video;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VideoDaoImpl implements VideoDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<Video> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Video.class).list();
    }
}
