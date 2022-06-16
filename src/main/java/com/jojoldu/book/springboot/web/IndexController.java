package com.jojoldu.book.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequiredArgsConstructor
@Controller
public class IndexController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index(){
        return "index";   // 원래는 DispatcherServlet이 알아서 지정해줘야돼서 ViewResolver 설정해줘야하지만, mustacherStart 에서 알아서 해줍니다. 기본값은 src/main/resources/templates, 확장자는 .mustache가 붙음
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }


}
