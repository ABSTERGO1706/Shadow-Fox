package com.example.IPL_Fan_Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "https://shadow-fox-frontend-mmf4dzod-absterqo1706s-projects.vercel.app")
@RestController
@RequestMapping("/Timeline")
public class TimelineController {

    @Autowired
    private TimelineService timelineService;

    @GetMapping
    public List<Timeline> getAllTimeline()
    {
        return timelineService.getAllTimeline();
    }
}
