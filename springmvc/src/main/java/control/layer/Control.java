package control.layer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.plaf.PanelUI;

/**
 * @Author LiSDong
 * @ClassName Control
 * @Description
 * @Date 2022/9/12 21:30
 * @Version 1.0
 */
@Controller
public class Control {
    @RequestMapping("/")
    public String jump(){
        return "redirect";
    }

    @RequestMapping("/indexs")
    public String add(){
        return "index";
    }

}
