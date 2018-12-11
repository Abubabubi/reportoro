package com.antonkom.reportoro

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DayController {

    @GetMapping("/")
    fun day(model: Model): String {
        model["title"] = "Day"
        return "day"
    }

}