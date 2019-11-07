package com.my.cloud.dto;

import lombok.Data;

import java.util.function.Function;

@Data
public class TreeDTO<T> {
    String id;
    String name;
    String parentId;
    /**
     * 文件通用下载：0：文件夹；1：文件
     */
    String type;
    Integer orderNo;
    T value;

    public static <T> void setIdFunction(TreeDTO treeDTO, T t,
            Function<? super T, String> getId)
    {
        treeDTO.setId(getId.apply(t));
    }

}
