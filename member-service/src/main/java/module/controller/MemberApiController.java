package module.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import module.Member;
import module.service.MemberService;
import support.Response;
import support.ResponseCode;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/member")
public class MemberApiController {

    private final MemberService memberService;

    @GetMapping("/list")
    public ResponseEntity<Response<List<Member>>> list(Model model) {
        List<Member> members = memberService.findAll();
        return ResponseEntity
            .ok(new Response<>(ResponseCode.Ok, "조회 완료", members));
    }

	/*
	 * // TODO: 회원 추가하기
	 * 
	 * @PostMapping public ResponseEntity<Response<Void>> add(@RequestBody Member
	 * member){
	 * 
	 * memberService.add(get, null)
	 * 
	 * return ResponseEntity .ok(new Response<>(ResponseCode.NotFound,
	 * ResponseCode.NotFound.name())); }
	 */
    
    // TODO: 회원 수정하기

    // TODO: 회원 삭제하기

    // TODO: 회원 찾기

}
