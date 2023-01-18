package com.WebsiteDownloader.Controllers;


import com.WebsiteDownloader.Services.DownloadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WebsiteDownloadController {

//    private static Logger logger = LoggerFactory.getLogger(WebsiteDownloaderApplication.class);

    @GetMapping("/downloadByUrl")
    public ResponseEntity<byte[]> downloadByUrl(@RequestParam String url) throws IOException, InterruptedException {
        if (url != null) {
            return DownloadService.downloadByUrl(url);
        } else {
            return null;
        }
    }
}
//
//        @GetMapping("/getDownloadRequestsByUserId")
//        public String getDownloadRequestsByUser (@RequestParam String id) throws IOException, InterruptedException {
////            return DownloadService.downloadByUrl(id);
//        }
//    }
//}
