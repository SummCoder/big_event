package com.study.backend.controller;

import com.study.backend.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author SummCoder
 * @desc 文件上传控制类
 * @date 2024/4/29 16:19
 */

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws IOException {
        // 将文件内容存储到本地磁盘上
        String originalFilename = file.getOriginalFilename();
        // 同名覆盖问题？
        // 保证文件的名字时唯一的，从而防止文件覆盖
        String filename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
        file.transferTo(new File("D:\\2024_03\\heima\\backend\\files\\" + filename));
        return Result.success("url访问地址...");
    }
}
