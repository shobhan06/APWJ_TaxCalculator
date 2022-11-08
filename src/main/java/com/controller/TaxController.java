package com.controller;


import com.domain.Info;
import com.repository.TaxRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping("/Tax")
public class TaxController {
    private TaxRepo taxRepository;

    public TaxController(TaxRepo taxRepository) {
        this.taxRepository = taxRepository;
    }

    @RequestMapping("/form")
    public String create(Model model) {
        model.addAttribute("info", new Info());
        return "form";
    }

    @RequestMapping("/list")
    public String list(Model model) throws SQLException {

        return "list";
    }

    @RequestMapping("/create")
    public String store(Model model,@Valid @ModelAttribute("Info") Info info, BindingResult bindingResult) throws SQLException {
        if (bindingResult.hasErrors()) {
            return "department/create";
        }
        taxRepository.create(info); //instance
        taxRepository.createBreakdown(info);

        return "list";
    }
}
