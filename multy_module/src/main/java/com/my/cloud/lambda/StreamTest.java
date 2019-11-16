package com.my.cloud.lambda;

import com.my.cloud.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-11-01 20:35
 **/
public class StreamTest {

    public static void main(String[] args) {
        List<UserDTO> list = new ArrayList<>();

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId("12");
        userDTO.setName("aa");

        UserDTO userDTO1 = new UserDTO();
        userDTO1.setUserId("12");
        userDTO1.setName("aa");

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setUserId("12");
        userDTO2.setName("aa");

        list.add(userDTO);
        list.add(userDTO1);
        list.add(userDTO2);

        Map<String, List<UserDTO>> userMap = list.stream().collect(Collectors.groupingBy(UserDTO::getUserId));

        System.out.println(userMap.toString());

    }

}
