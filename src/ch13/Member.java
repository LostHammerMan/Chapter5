package ch13;

//public class Member implements Comparable<Member>{

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public Member() {

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId);
    }

    // 중복 체크
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member){
            Member member = (Member) obj;
            if (this.memberId == member.memberId){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
    }

//    @Override
//    public int compareTo(Member member) {
//
//////        // 오름차순 출력
//////       if (this.memberId > member.memberId){
//////            return 1;
//////        } else if (this.memberId < member.memberId) {
//////            return -1;
//////        }else {
//////            return 0;
//////        }
////
////       // 내림차순
////        if (this.memberId > member.memberId){
////            return -1;
////        } else if (this.memberId < member.memberId) {
////            return 1;
////        }else {
////            return 0;
////        }
//
//        // 올림차순
//        return (this.memberId - member.memberId);
//
//        // 내림차순
////        return (this.memberId - member.memberId) * -1;
//
//    }
}
