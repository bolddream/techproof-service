package com.mancheng.cn.techproof.api;

import com.mancheng.cn.techproof.model.BaiduHomePageData;
import com.mancheng.cn.techproof.model.BaiduHomePageResponseData;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link BaiduHomeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface BaiduHomeApiDelegate {

    /**
     * @see BaiduHomeApi#baiduHomePageInfo
     */
    ResponseEntity<BaiduHomePageResponseData> baiduHomePageInfo( BaiduHomePageData  body);

}
