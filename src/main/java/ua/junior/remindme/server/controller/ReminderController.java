package ua.junior.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Вевдюк on 28.01.2016.
 */

@Controller
@RequestMapping("/reminder")
public class ReminderController {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getReminder(ModelMap model){
        return "My reminder";
    }
}
