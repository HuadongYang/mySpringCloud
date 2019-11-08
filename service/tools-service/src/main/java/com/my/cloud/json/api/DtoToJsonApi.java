package com.my.cloud.json.api;

import com.alibaba.fastjson.JSONObject;
import com.my.cloud.json.service.JsonGenerateService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("dto转json")
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
