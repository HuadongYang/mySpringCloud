package com.my.cloud.lambda;

import com.my.cloud.dto.AttachmentDTO;
import com.my.cloud.dto.TreeDTO;
import org.junit.Test;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Set;
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


    private <T> void addTreeDTOs(Set<TreeDTO> catalogs,
                                 Map<BigInteger, List<AttachmentDTO>> attachmentMap,
                                 List<T> list,
                                 Function<? super T, BigInteger> getId,
                                 Function<? super T, Object> getName,
                                 Function<? super T, BigInteger> getParentId,
                                 Function<? super T, Integer> getOrderNo,
                                 String parentId) {
        for (T t : list) {
            TreeDTO treeDTO = new TreeDTO(String.valueOf(getId.apply(t)), String.valueOf(getName.apply(t)),
                    getParentId == null ? String.valueOf(getParentId.apply(t)) : parentId, getOrderNo.apply(t));
            if (attachmentMap != null)
                treeDTO.setValue(attachmentMap.get(getId.apply(t)));
            catalogs.add(treeDTO);
        }
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
    }



}
