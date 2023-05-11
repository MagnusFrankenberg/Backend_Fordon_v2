package com.backend_fordon_v2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FordonController {

    fordonRepo fordonRepo = new fordonRepo();
    List<String> fordon = fordonRepo.fordon;


    @RequestMapping("/fordon")
    public String fordon(){
        return "Välkommen! Här får du ett fordon! Ange \"slump\" eller ett nr 0 till 9";
    }

    @RequestMapping("/fordon/slump")
    public String getSlumpatFordon(){
        return fordonRepo.getFordon();
    }

    @RequestMapping("/fordon/{nr}")
    public String getEttFordon(@PathVariable int nr){
        return fordon.get(nr);
    }

    @RequestMapping("/fordon/alla")
    public List<String> getAllaFordon(){
        return fordon;
    }
}
