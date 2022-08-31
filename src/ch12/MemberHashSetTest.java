package ch12;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);


        // 중복된 이유 : memberId 에 대한 정의가 없기 때문
        Member memberHong = new Member(1003, "홍길동");
        memberHashSet.addMember(memberHong);


        memberHashSet.showAllMember();
        memberHashSet.removeMember(memberKim.getMemberId());
        memberHashSet.showAllMember();

    }
}
