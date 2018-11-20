/**
 * 
 * File: HelloController.java <br/>
 * Package: com.study.spring.mvc.controller <br/>
 * Description:TODO(用一句话描述该文件做什么) <br/>
 * @author zhengxy
 * @Date 2018年10月10日 下午2:55:56
 * @version 1.0
 * 
 */
package com.study.spring.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

/** 
 *   
 * @author zhengxy
 * @date 2018年10月10日 下午2:55:56  
 *   
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);
    
    private static final String FILE_PAHT_ROOT = "E:\\temp\\file\\";
    
    @RequestMapping("/")
    public String hello() {
        //http://localhost:8080/study-spring-mvc/hello
        return "hello";
    }
    @RequestMapping("/view")
    public ModelAndView login(HttpServletRequest request){
        //http://localhost:8080/study-spring-mvc/view?path=hello
        String path = request.getParameter("path")+"";
        ModelAndView mav = new ModelAndView();
        
        String contextPath = request.getContextPath();
        mav.addObject("contextPath", contextPath);
        
        mav.setViewName(path);
        return mav;
    }
    
    /**
     * 
     * @Title: showUploadPage  
     * @Description: 定位到上传单个文件界面 /hello/upload  
     * @param request
     * @return
     */
    @RequestMapping(value="/upload", method=RequestMethod.GET)      
    public ModelAndView showUploadPage(HttpServletRequest request){
        //http://localhost:8080/study-spring-mvc/hello/upload
        //view文件夹下的上传单个文件的页面      
        ModelAndView mav = new ModelAndView();
        
        String contextPath = request.getContextPath();
        mav.addObject("contextPath", contextPath);
        
        mav.setViewName("uploadFile");
        return mav;
    }
    
    /**  
     * 上传单个文件操作  
     *  @param RequestParam 括号中的参数名file和表单的input节点的name属性值一致 
     * @return   
     */ 
    @RequestMapping(value="/doUpload", method=RequestMethod.POST)   
    public String doUploadFile(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                // 这里将上传得到的文件保存至 E:\\temp\\file 目录
                FileUtils.copyInputStreamToFile(file.getInputStream(),
                        new File(FILE_PAHT_ROOT, System.currentTimeMillis() + file.getOriginalFilename()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "success"; // 上传成功则跳转至此success.jsp页面
    }
    
    /**
     * 
     * @Title: showUploadPage2  
     * @Description: 定位到上传多个文件界面 /hello/uploadMulti  
     * @param request
     * @return
     */
    @RequestMapping(value="/uploadMulti", method=RequestMethod.GET)      
    public ModelAndView showUploadPage2(HttpServletRequest request){
        //http://localhost:8080/study-spring-mvc/hello/uploadMulti
        //view文件夹下的上传单个文件的页面      
        ModelAndView mav = new ModelAndView();
        
        String contextPath = request.getContextPath();
        mav.addObject("contextPath", contextPath);
        
        mav.setViewName("uploadMultifile");
        return mav;
    }
    
    /**
     * 上传多个附件的操作类
     * @param multiRequest
     * @return
     * @throws IOException
     */     
    @RequestMapping(value="/doMultiUpload", method=RequestMethod.POST)
    public String doUploadFile2(MultipartHttpServletRequest multiRequest) throws IOException {
        Iterator<String> filesNames = multiRequest.getFileNames(); // 获得所有的文件名
        while (filesNames.hasNext()) { // 迭代，对单个文件进行操作
            String fileName = filesNames.next();
            MultipartFile file = multiRequest.getFile(fileName);
            if (!file.isEmpty()) {
                log.debug("Process file: {}", file.getOriginalFilename());
                FileUtils.copyInputStreamToFile(file.getInputStream(),
                        new File(FILE_PAHT_ROOT, System.currentTimeMillis() + file.getOriginalFilename()));
            }
        }
        return "success";
    }
}
