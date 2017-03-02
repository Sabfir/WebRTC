package com.softserve.webrtc.contoller;

import com.softserve.webrtc.model.Video;
import com.softserve.webrtc.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("/")
    public String test() {
        return "Spring boot works!";
    }

    @RequestMapping("/video")
    public ResponseEntity<?> getAllVideo() {
        List<Video> videos = videoService.getAll();
        return new ResponseEntity<>(videos, HttpStatus.OK);
    }
}
