package com.wch.taotao.pagehelper;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wch.taotao.mapper.TbItemMapper;
import com.wch.taotao.pojo.TbItem;
import com.wch.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class PageHelperTest {

    @Resource
    private TbItemMapper tbItemMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(PageHelperTest.class);

    @Test
    public void testPageHelper() throws Exception {
        int pageNum = 1;
        int pageSize = 10;
        PageHelper.startPage(pageNum, pageSize);

        // 3.执行查询
        List<TbItem> tbItems = tbItemMapper.selectByExample(new TbItemExample());
        PageInfo<TbItem> pageInfo = new PageInfo<>(tbItems);

        // 4.取分页信息
        long total = pageInfo.getTotal();
        int pages = pageInfo.getPages();
        int size = tbItems.size();

        LOGGER.info("total: {}, pages: {}, size: {}", total, pages, size);
    }

}
