package com.my.cloud.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class AttachmentDTO {

    private BigInteger id;
    private BigInteger parentId;
    private BigInteger departmentId;
    private BigInteger projectId;
    private BigInteger tenantId;
    private String fileId;
    private String fileName;
    private Long size;
    private String moduleCode;

    private Long sysCreateTime;

    private String sysCreatorId;

    private String sysCreatorName;

    private String downloadUrl;

    private String ids;
}
