package com.my.cloud.json.api;

import com.alibaba.fastjson.JSONObject;
import com.my.cloud.json.service.JsonGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/transform")
public class DtoToJsonApi {

    @Autowired
    JsonGenerateService jsonGenerateService;

    @RequestMapping(value = "/dto/json", method = RequestMethod.POST)
    public JSONObject dtoToJson(@RequestBody String dto){
        return jsonGenerateService.dtoToJson(dto);
    }
}
