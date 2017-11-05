package com.wch.taotao.service.impl;

import com.wch.taotao.mapper.TbItemMapper;
import com.wch.taotao.pojo.TbItem;
import com.wch.taotao.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private TbItemMapper itemMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceImpl.class);

    /**
     * 查询商品
     *
     * @param id
     * @return
     */
    @Override
    public TbItem getItemById(long id) {
        LOGGER.info("com.wch.taotao.service.impl.ItemServiceImpl.getItemById, id: {}", id);
        return itemMapper.selectByPrimaryKey(id);
    }
}
