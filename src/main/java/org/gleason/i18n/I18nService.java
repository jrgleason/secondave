package org.gleason.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import java.util.Locale;

@Service
public class I18nService {
    @Autowired
    private MessageSource messageSource;
    public String getValue(String key, Locale locale){
        return messageSource.getMessage(key,null,locale);
    }
}
