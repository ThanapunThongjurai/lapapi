package rmuti.lapapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")

public class HelloController {

    @GetMapping("/index/{path1}")
    public Object index(@PathVariable String path1,@RequestParam String param1){
        return String.format("hello path %s,param1 %s",path1,param1);
    }

    @PostMapping("posttest")
    public Object postTest(){
        return "Hello Post";
    }
}
