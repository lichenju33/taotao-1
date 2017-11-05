package com.wch.taotao.web;

import com.wch.taotao.pojo.TbItem;
import com.wch.taotao.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 商品管理
 */
@Controller
public class ItemController {

    @Resource
    private ItemService itemService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

    @RequestMapping("/item/{itemId}")
    public @ResponseBody
    TbItem getItemById(@PathVariable("itemId") long itemId) {
        LOGGER.info("com.wch.taotao.web.ItemController.getItemById, id: {}", itemId);
        return itemService.getItemById(itemId);
    }
}
