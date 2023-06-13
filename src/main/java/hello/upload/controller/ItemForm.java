package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
// 상품 저장용 폼
public class ItemForm {

    private Long itemId;
    private String itemName;
    // 멀티파트는 @ModelAttribute 에서 사용할 수 있다.
    private MultipartFile attachFile;
    // 이미지를 다중 업로드 하기 위해 MultipartFile 를 사용했다.
    private List<MultipartFile> imageFiles;
}
