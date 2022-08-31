package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

    public static void main(String[] args) {

       MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);


        // 중복된 이유 : memberId 에 대한 정의가 없기 때문
        Member memberHong = new Member(1003, "홍길동");
        memberHashMap.addMember(memberHong);


        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1001, "kim");
        hashMap.put(1002, "kim2");
        hashMap.put(1003, "kim3");
        hashMap.put(1004, "kim4");

        System.out.println(hashMap); // toString() 출력시 {key, value} 출력
    }
}
