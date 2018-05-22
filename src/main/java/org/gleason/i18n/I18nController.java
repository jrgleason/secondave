package org.gleason.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class I18nController {
    I18nService service;
    public I18nController(
            @Autowired I18nService service
    ){
        this.service = service;
    }
    @GetMapping("/i18n")
    @ResponseBody
    public String getMessageFromString(
            @RequestParam("key") String key,
            HttpServletRequest request
    ){
        return this.service.getValue(key, request.getLocale());
    }
}
