package com.db.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("usercontroller")
public class UserController {
    @RequestMapping("show")
//    public String show(HttpServletRequest request) throws Exception {
//        ServletFileUpload sf = new ServletFileUpload();
//        DiskFileItemFactory dff = new DiskFileItemFactory();
//        sf.setFileItemFactory(dff);
//        ServletRequestContext servletRequestContext = new ServletRequestContext(request);
//        List<FileItem> fileItems = sf.parseRequest(servletRequestContext);
//        for (FileItem item : fileItems) {
//            if(!item.isFormField()){
//                System.out.println("1111");
//                System.out.println(item.getName());
//                item.write(new File("E:\\"+item.getName()));
//            }
//        }
//        return "two";
//    }

    public String show(MultipartFile uplocal) throws Exception {
        System.out.println(uplocal.getOriginalFilename());
        uplocal.transferTo(new File("E:\\"+uplocal.getOriginalFilename()));
        return "two";
    }
}
