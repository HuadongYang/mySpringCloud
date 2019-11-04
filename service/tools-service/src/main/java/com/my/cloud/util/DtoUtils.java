package com.my.cloud.util;/**
 * Created by yanghd on 2019/10/21.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yanghd
 * @create: 2019-10-21 13:30
 **/
public class DtoUtils {


    public static List<String> removeAnnotation(String dto){
        String[] lines = dto.split("\n");

        List<String> results = new ArrayList<>();
        boolean deleteFlage = false;
        for(String line : lines){
            line = line.trim();
            if (line.contains("*/")) {
                deleteFlage = false;
                continue;
            }
            if (deleteFlage)
                continue;
            if (line.startsWith("/*")){
                deleteFlage = true;
            }else if (line.matches("^\\w.*"))
                results.add(line);
        }

        return results;
    }

    public static List<String> getValues(String dto){
        List<String> lines = removeAnnotation(dto);
        List<String> results = new ArrayList<>();
        String[] strings;
        for(String line : lines){
            strings = line.split("\\s");
            results.add(strings[strings.length-1].replace(";",""));
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> list = removeAnnotation("private String id;\n" +
                "    /**\n" +
                "     * 模板\n" +
                "     */\n" +
                "    @Size(max = 20)\n" +
                "    private String templateId;\n" +
                "    /**\n" +
                "     * 分类\n" +
                "     */\n" +
                "    @Size(max = 20)\n" +
                "    private String categoryId;\n" +
                "    @Size(max = 200)\n" +
                "    private String categoryName;\n" +
                "    /**\n" +
                "     * 名称+\n" +
                "     */\n" +
                "    @Size(max = 4000)\n" +
                "    private String name;\n" +
                "    //表单编号\n" +
                "    @Size(max = 200)\n" +
                "    private String code;\n" +
                "    /**\n" +
                "     * 内容\n" +
                "     */\n" +
                "    private String content;\n" +
                "    /**\n" +
                "     * 签字状态 1未签字 2已签字\n" +
                "     */\n" +
                "    private Integer signStatus;\n" +
                "\n" +
                "    private Boolean associateProblem;\n" +
                "\n" +
                "    private String sysCreatorId;\n" +
                "    private String sysCreatorName;\n" +
                "    private Date sysCreateTime;");
    }
}
