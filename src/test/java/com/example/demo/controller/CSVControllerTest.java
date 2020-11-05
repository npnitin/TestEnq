package com.example.demo.controller;

import com.example.demo.dto.RequestDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.util.CsvUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RestController
@RequestMapping("api/v1")
class CSVControllerTest {

    @PostMapping
    public ResponseDTO getAvgByColumn(@RequestParam("file") MultipartFile file,@RequestParam("Column") String column) throws IOException {
        List<RequestDTO> list = CsvUtils.read(RequestDTO.class,file.getInputStream());
        System.out.println(list);
        System.out.println(column);
        return null;
    }

}