package jp.educure.problem4.meetingroom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MeetingRoomController {
    
    @GetMapping("/form")
    public String reservationForm(Model model) {
        model.addAttribute("form", new MeetingRoomForm());
        return "input";
    }
    
    @PostMapping("/check")
    public String reservationConfirmation(@ModelAttribute("form") MeetingRoomForm form, BindingResult result, Model model) {
        //TODO: process POST request
        MeetingRoomVilidator meetingRoomVilidator = new MeetingRoomVilidator();
        meetingRoomVilidator.validate(form, result);

        if(result.hasErrors()) {
            return "input";
        }
        model.addAttribute("check", form);
        return "confirm";
    }
    
}
