package jp.educure.dashboard;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("商品1",500));
        itemList.add(new Item("商品2",1500));
        itemList.add(new Item("商品3",3000));

        model.addAttribute("name","山田太郎");
        model.addAttribute("mail", "taro.yamada@example.com");
        model.addAttribute("itemList", itemList);
        return "dashboard";
    }
}
