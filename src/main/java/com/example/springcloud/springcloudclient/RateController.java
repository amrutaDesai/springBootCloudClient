package com.example.springcloud.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Amruta on 4/21/2017.
 */
@Controller
public class RateController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @Value("${tollstart}")
    String tollstart;

    @Value("${conString}")
    String conString;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateamount",rate);
        m.addAttribute("lanes",lanecount);
        m.addAttribute("tollstart",tollstart);
        m.addAttribute("conString",conString);

        return "rateView";
    }
}
