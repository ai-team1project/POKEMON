package org.koreait.mypage.controllers;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.koreait.file.entities.FileInfo;
import org.koreait.member.constants.Authority;
import org.koreait.member.constants.Gender;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
public class RequestProfile {

    private String mode;

    private String email;

    @NotBlank
    private String name; // 회원명

    @NotBlank
    private String nickName;

    //@Size(min=8)
    private String password;
    private String confirmPassword;

    @NotNull
    private Gender gender; // 성별

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDt; // 생년월일

    @NotBlank
    private String zipCode;

    @NotBlank
    private String address;
    private String addressSub;

    private List<String> optionalTerms; // 추가 선택 약관

    private List<Authority> authorities;

    private FileInfo profileImage;

    // 추가된 코드 시작
    // 사용자가 수정 가능한 별도의 프로필 수정 항목

    private String currentPassword; // 현재 비밀번호 (수정 시 필요한 필드)
    private String newPassword;     // 새로운 비밀번호
    private String confirmNewPassword; // 새로운 비밀번호 확인

    // 수정할 주소 관련 필드
    private String newAddress;  // 수정된 주소
    private String newAddressSub; // 수정된 상세 주소

    // 프로필 이미지 파일
    private FileInfo newProfileImage; // 새로운 프로필 이미지 파일

    // 선택적으로 포함할 수 있는 필드 (옵션)
    private String additionalNotes; // 추가 메모 또는 사용자 요청 사항

    // 추가된 코드 끝
}
