package jp.educure.problem5.userprofilecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserProfileController {
    
    private final UserProfileForm profile = new UserProfileForm();

    public UserProfileController(){
        profile.setId(1);
        profile.setName("田中太郎");
        profile.setAge(30);
        profile.setBio("よろしくお願いします！");
    }

    @GetMapping("/profile/{id}")
    public String view(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("form", profile);
        return "profile-view";
    }

    //@GetMapping("/profile/{id}/edit")
    @GetMapping("/profile/edit")
    public String edit(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("form", profile);
        return "profile-edit";
    }  

    @PostMapping("/profile/edit")
    public String backToEdit(UserProfileForm form, Model model) {
        model.addAttribute("form", form); 
        return "profile-edit";
    }

    @PostMapping("/profile/check")
    public String check(UserProfileForm form, Model model) {
        model.addAttribute("form", form);
        return "profile-confirm";
    }

    @PostMapping("/profile/confirm")
    public String confirm(UserProfileForm form,  RedirectAttributes redirectAttributes) {
        profile.setId(form.getId());
        profile.setName(form.getName());
        profile.setAge(form.getAge());
        profile.setBio(form.getBio());
        redirectAttributes.addFlashAttribute("message", "プロフィールが更新されました");
        return "redirect:/profile/" + profile.getId();
    }
}
