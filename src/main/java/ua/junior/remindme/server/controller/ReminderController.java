package ua.junior.remindme.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.junior.remindme.server.entity.Remind;
import ua.junior.remindme.server.repository.RemindRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Вевдюк on 28.01.2016.
 */

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(){
        List<Remind> list = remindRepository.findAll();
        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("My first remind");
        return remind;
    }
}
