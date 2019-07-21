package com.mancheng.cn.techproof.api;

import com.mancheng.cn.techproof.model.BaiduHomePageData;
import com.mancheng.cn.techproof.model.BaiduHomePageResponseData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@Controller
public class BaiduHomeApiController implements BaiduHomeApi {

    private static final Logger log = LoggerFactory.getLogger(BaiduHomeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BaiduHomeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BaiduHomePageResponseData> baiduHomePageInfo(@ApiParam(value = "baidu homepage info parameters"  )  @Valid @RequestBody BaiduHomePageData body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BaiduHomePageResponseData>(objectMapper.readValue("{
  "returnCode" : 0,
  "returnMessage" : "Success",
  "responseData" : {
    "title" : "1901"
  }
}", BaiduHomePageResponseData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BaiduHomePageResponseData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BaiduHomePageResponseData>(HttpStatus.NOT_IMPLEMENTED);
    }

}
