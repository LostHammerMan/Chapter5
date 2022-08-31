package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    // String 에는 이미 Comparable이 구현되어 있음
    @Override
    public int compare(String s1, String s2) {
        // 오름차순
        return s1.compareTo(s2);

        // 내림차순
//        return  s1.compareTo(s2) * -1;
    }
}

public class MemberHashSetTest {

    public static void main(String[] args) {



        /*
        TreeSet<String> set = new TreeSet<String>();

//        set.add("홍길동");
//        set.add("강감찬");
//        set.add("이순신");
//
//        System.out.println(set); // 정렬되서 출력됨, binary Tree


        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1004, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1001, "홍길동");

        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);




        memberTreeSet.showAllMember();
        // Comparable 이 구현되어 있지 않으면 error 발생

 */

//        memberTreeSet.showAllMember();

        // new MyCompare --> 비교대상을 명시
        TreeSet<String> set = new TreeSet<String>(new MyCompare());
        set.add("Park");
        set.add("Kim");
        set.add("Lee");

        System.out.println(set);
    }
}
