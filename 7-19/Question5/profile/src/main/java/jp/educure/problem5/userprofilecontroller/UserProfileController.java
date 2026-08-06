package jp.educure.problem5.userprofilecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserProfileController {
    
    @GetMapping("/profile/{id}")
    public String view(@PathVariable("id") Integer id, Model model) {

        UserProfileForm form = new UserProfileForm();
        form.setId(id);
        form.setName("田中太郎");
        form.setAge(30);
        form.setBio("よろしくお願いします！");
        
        model.addAttribute("form", form);
        return "profile-view";
    }

    @GetMapping("/profile/{id}/edit")
    public String edit(@PathVariable("id") Integer id, UserProfileForm form, Model model) {
        model.addAttribute("form", form);
        return "profile-edit";
    }

    @PostMapping("/profile/check")
    public String check(UserProfileForm form, Model model) {
        model.addAttribute("form", form);
        return "profile-confirm";
    }

    @PostMapping("/profile/confirm")
    public String confirm(UserProfileForm form,  RedirectAttributes redirectAttributes, Model model) {
        model.addAttribute("form", form);
        redirectAttributes.addFlashAttribute("message", "プロフィールが更新されました");
        return "redirect:/profile/" + form.getId();
    }
}
