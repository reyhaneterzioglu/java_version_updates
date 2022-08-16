package com.cydeo.tasks.second;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        List<Member> members = new ArrayList<>();

        members.add(new Member(35, Gender.FEMALE));
        members.add(new Member(22, Gender.MALE));

        //                               ( Member member ) is also correct, but no need to write the type since its same as the method in interface
        MemberPredicate memberPredicate = member -> member.getAge() >= 18 && member.getAge() <= 25 &&
                member.getGender()==Gender.MALE;


        sendMessage(members, memberPredicate);

      //  sendMessage(members, member -> member.getAge() >= 18 && member.getAge() <= 25 &&
        //        member.getGender().equals(Gender.MALE));

    }

    public static void sendMessage(List<Member> members, MemberPredicate memberPredicate) {

        List<Member> result = new ArrayList<>();
        for (Member member : members) {
            if (memberPredicate.test(member)) {
             //   System.out.println("sending message to " + member);
                result.add(member);
            }
        }

        System.out.println(result);

    }
}
/*
Suppose that you are creating a social networking application.
You want to create a feature that enables an administrator to perform any kind of action, such as
sending a message, on members of the social networking application that satisfy certain criteria.
Criteria : Send message to Male Members whose age is between 18 and 25
 */