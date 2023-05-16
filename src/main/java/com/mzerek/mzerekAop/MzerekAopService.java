package com.mzerek.mzerekAop;

import org.springframework.stereotype.Service;

@Service
public class MzerekAopService {

    @MzerekAnnotation
    public void mzerekMethodService() {
        System.out.println("In mzerek service");
    }
}
