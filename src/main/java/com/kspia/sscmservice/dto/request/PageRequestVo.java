package com.kspia.sscmservice.dto.request;

import lombok.Data;

@Data
public class PageRequestVo {
    private int page;
    private int size;

    public PageRequestVo() {
        this.page = 0;
        this.size = 10;
    }
}
