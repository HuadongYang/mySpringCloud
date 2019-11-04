package com.my.cloud.json.service.impl;/**
 * Created by yanghd on 2019/10/21.
 */

import com.alibaba.fastjson.JSONObject;
import com.my.cloud.json.service.JsonGenerateService;
import com.my.cloud.util.DtoUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: yanghd
 * @create: 2019-10-21 14:38
 **/
@Service
public class JsonGenerateServiceImpl implements JsonGenerateService {


    @Override
    public JSONObject dtoToJson(String dto) {
        List<String> values = DtoUtils.getValues(dto);

        JSONObject jsonObject = new JSONObject();

        for(String value : values){
            jsonObject.put(value, "");
        }
        return jsonObject;
    }
}
