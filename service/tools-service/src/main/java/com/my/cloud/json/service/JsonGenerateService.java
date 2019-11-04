package com.my.cloud.json.service;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by yanghd on 2019/10/21.
 */
public interface JsonGenerateService {

    JSONObject dtoToJson(String dto);
}
