package com.wch.taotao.service;

import com.wch.taotao.pojo.TbItem;

public interface ItemService {

    /**
     * 查询商品
     *
     * @param id
     * @return
     */
    TbItem getItemById(long id);
}
