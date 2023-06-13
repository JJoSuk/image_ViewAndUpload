package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    // 2개를 만든 이유는 2명 이상의 사용자가 같은 이름의 이미지를 등록할 경우 안겹치게 하기 위해
    // uploadFileName 고객이 업로드한 파일
    private String uploadFileName;
    // storeFileName 서버 내부에서 관리하는 파일명
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
