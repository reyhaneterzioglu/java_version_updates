package com.cydeo.tasks.second;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {

        List<Member> members = new ArrayList<>();

        members.add(new Member(35, Gender.FEMALE));
        members.add(new Member(22, Gender.MALE));

        MemberPredicate memberPredicate = (Member member) -> member.getAge() >= 18 && member.getAge() <= 25 &&
                member.gender.equals(Gender.MALE);
        sendMessage(members, memberPredicate);


    }

    public static void sendMessage(List<Member> members, MemberPredicate memberPredicate) {

        for (Member member : members) {
            if (memberPredicate.test(member)) {
                System.out.println("sending message to " + member);
            }
        }

    }
}
/*
Suppose that you are creating a social networking application.
You want to create a feature that enables an administrator to perform any kind of action, such as
sending a message, on members of the social networking application that satisfy certain criteria.
Criteria : Send message to Male Members whose age is between 18 and 25
 */