package com.my.cloud.lambda;

import com.my.cloud.dto.TreeDTO;
import com.my.cloud.dto.UserDTO;
import org.junit.Test;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

public class FunctionTest {

    /**
     * Function第一个参数是apply接收的类型，第二个参数是方法本身的返回类型
     * @param treeDTO
     * @param getId
     */
    public void getIdFunction(TreeDTO treeDTO, Function<TreeDTO, String> getId){
        treeDTO.setOrderNo(Integer.valueOf(getId.apply(treeDTO)));
    }

    @Test
    public void getIdFunctionTest(){
        TreeDTO treeDTO = new TreeDTO();
        treeDTO.setId("12");
        getIdFunction(treeDTO, TreeDTO::getId);
        System.out.println(treeDTO.getOrderNo());
    }

    @Test
    public void treeDTOTest(){
        TreeDTO treeDTO = new TreeDTO();

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId("123");

        TreeDTO.setIdFunction(treeDTO, userDTO, UserDTO::getUserId);
        System.out.println(treeDTO.getId());
    }



}
