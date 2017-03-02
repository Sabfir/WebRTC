package com.softserve.webrtc.service;

import com.softserve.webrtc.dao.VideoDao;
import com.softserve.webrtc.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoDao videoDao;

    @Override
    @Transactional
    public List<Video> getAll() {
        return videoDao.getAll();
    }
}
