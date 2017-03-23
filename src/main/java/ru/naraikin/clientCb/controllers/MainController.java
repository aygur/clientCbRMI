package ru.naraikin.clientCb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.naraikin.clientCb.ClientConverter;
import ru.naraikin.clientCb.VoluteCources;

/**
 * Created by dmitrii on 06.03.17.
 */
@Controller
public class MainController {

//    @Autowired
//    private VoluteCources voluteCources;
//
    @Autowired
    private ClientConverter clientConverter;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("hello", "Hello");
        model.addAttribute("vol", clientConverter.getVoluteCources().convert(50f));
        return "index";
    }

}
