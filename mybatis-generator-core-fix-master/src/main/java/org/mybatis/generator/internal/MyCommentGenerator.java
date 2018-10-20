package org.mybatis.generator.internal;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * User: lanxinghua
 * Date: 2018/10/20 18:34
 * Desc:
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

    //类上添加注释
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.addJavaDocLine("/**");
        String remark = introspectedTable.getRemarks();
        if (StringUtils.isNotBlank(remark)) {
            topLevelClass.addJavaDocLine(" * " + remark);
        }
        topLevelClass.addJavaDocLine(" * ");
        topLevelClass.addJavaDocLine(" * " + "@author " + getAuthor());
        topLevelClass.addJavaDocLine(" * " + "@date " + getDateContent());
        topLevelClass.addJavaDocLine(" */");
    }

    //属性上添加注释
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remark = introspectedColumn.getRemarks();
        if (StringUtils.isNotBlank(remark)) {
            field.addJavaDocLine("/**");
            field.addJavaDocLine(" * " + remark);
            field.addJavaDocLine(" */");
        }
    }

    //get方法添加注释
    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    }

    //setter方法添加注释
    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addComment(XmlElement xmlElement) {

    }
}
