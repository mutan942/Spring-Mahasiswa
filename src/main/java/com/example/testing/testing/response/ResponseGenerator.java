package com.example.testing.testing.response;

import org.springframework.stereotype.Component;

@Component
public class ResponseGenerator<T> {

    public static <T> CommonResponse<T> responseberhasil(T datas, String message){
        CommonResponse comm = new CommonResponse<>();
        comm.setStatus("200");
        comm.setMessage(message);
        comm.setDatas(datas);

        return comm;
    }

}
