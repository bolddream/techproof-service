package com.mancheng.cn.techproof.delegate;

import com.mancheng.cn.techproof.api.BaiduHomeApiDelegate;
import com.mancheng.cn.techproof.model.BaiduHomePageData;
import com.mancheng.cn.techproof.model.BaiduHomePageResponseData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class BaiduHomeApiDelegateImpl implements BaiduHomeApiDelegate {
    @Override
    public ResponseEntity<BaiduHomePageResponseData> baiduHomePageInfo(BaiduHomePageData body) {
        return null;
    }
}
