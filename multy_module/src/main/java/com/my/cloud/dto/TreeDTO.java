package com.my.cloud.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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


    public TreeDTO(String id, String name, String parentId, Integer orderNo) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.orderNo = orderNo;
    }
}
