/*
 * 文  件   名: CategoryServiceImpl.java
 * 版         本 : (Anttribe) openeshop-good-server All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月11日
 */
package org.anttribe.openeshop.good.intf.impl;

import java.util.List;

import org.anttribe.openeshop.good.assembler.CategoryAssembler;
import org.anttribe.openeshop.good.bo.CategoryBo;
import org.anttribe.openeshop.good.domain.Category;
import org.anttribe.openeshop.good.intf.ICategoryService;

/**
 * @author zhaoyong
 * @version 2015年10月11日
 */
public class CategoryServiceImpl implements ICategoryService
{
    
    @Override
    public List<CategoryBo> listCategories(String parent)
    {
        if (null == parent)
        {
            parent = "";
        }
        List<Category> categories = Category.listByParent(parent);
        return CategoryAssembler.toBo(categories);
    }
    
    @Override
    public void saveCategory(CategoryBo category)
    {
    }
    
    @Override
    public void updateCategory(CategoryBo category)
    {
    }
    
    @Override
    public void deleteCategory(CategoryBo category)
    {
    }
}